package com.example.thinking.document

import android.content.Intent
import android.content.IntentSender
import android.os.Bundle
import android.provider.DocumentsContract
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.thinking.R
import com.example.thinking.databinding.ActivityDocumentScannerBinding
import com.example.thinking.util.Logcat
import com.example.thinking.util.selfActivity
import com.google.mlkit.vision.documentscanner.GmsDocumentScannerOptions
import com.google.mlkit.vision.documentscanner.GmsDocumentScanning
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

class DocumentScannerActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDocumentScannerBinding.inflate(layoutInflater)
    }

    private val scannerLauncher = registerForActivityResult(
        ActivityResultContracts.StartIntentSenderForResult()
    ) res@{ launcherResult ->
        val launcherData = launcherResult?.data ?: return@res
        val result = GmsDocumentScanningResult.fromActivityResultIntent(launcherData) ?: return@res
        val pdf = result.pdf ?: return@res
        val uri = pdf.uri
        Logcat.msg("pdf: $uri")
        val intent = Intent(Intent.ACTION_CREATE_DOCUMENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "application/pdf"
            putExtra(Intent.EXTRA_TITLE, "invoice.pdf")

            // Optionally, specify a URI for the directory that should be opened in
            // the system file picker before your app creates the document.
            // putExtra(DocumentsContract.EXTRA_INITIAL_URI, uri)
        }
        saveLauncher.launch(intent)
    }
    private val saveLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) res@{ launcherResult ->
        val launcherData = launcherResult?.data ?: return@res
        val uri = launcherData.data ?: return@res
        Logcat.msg("uri: $uri")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnScan.setOnClickListener {
            startScan()
        }
    }

    fun startScan() {
        lifecycleScope.launch {
            val intentSender = scanIntentSender()
            val intent = IntentSenderRequest.Builder(intentSender).build()
            scannerLauncher.launch(intent)
        }
    }

    suspend fun scanIntentSender(): IntentSender {
        val options = GmsDocumentScannerOptions.Builder()
            .setGalleryImportAllowed(true)
            .setPageLimit(2)
            .setResultFormats(
                GmsDocumentScannerOptions.RESULT_FORMAT_JPEG,
                GmsDocumentScannerOptions.RESULT_FORMAT_PDF
            )
            .setScannerMode(GmsDocumentScannerOptions.SCANNER_MODE_FULL)
        val intentSender = GmsDocumentScanning.getClient(options.build())
            .getStartScanIntent(selfActivity).await()
        return intentSender
    }
}