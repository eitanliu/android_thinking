package android.content.pm;

import android.annotation.NonNull;
import android.annotation.UnsupportedAppUsage;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import java.security.PublicKey;

public class VerifierInfo implements Parcelable{
    /** Package name of the verifier. */
    public final String packageName;

    /** Signatures used to sign the package verifier's package. */
    public final PublicKey publicKey;

    /**
     * Creates an object that represents a verifier info object.
     *
     * @param packageName the package name in Java-style. Must not be {@code
     *            null} or empty.
     * @param publicKey the public key for the signer encoded in Base64. Must
     *            not be {@code null} or empty.
     * @throws IllegalArgumentException if either argument is null or empty.
     */
    @UnsupportedAppUsage(maxTargetSdk = Build.VERSION_CODES.R, trackingBug = 170729553)
    public VerifierInfo(String packageName, PublicKey publicKey) {
        if (packageName == null || packageName.length() == 0) {
            throw new IllegalArgumentException("packageName must not be null or empty");
        } else if (publicKey == null) {
            throw new IllegalArgumentException("publicKey must not be null");
        }

        this.packageName = packageName;
        this.publicKey = publicKey;
    }

    private VerifierInfo(Parcel source) {
        packageName = source.readString();
        publicKey = (PublicKey) source.readSerializable(java.security.PublicKey.class.getClassLoader(), java.security.PublicKey.class);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(packageName);
        dest.writeSerializable(publicKey);
    }

    public static final @NonNull Parcelable.Creator<VerifierInfo> CREATOR
            = new Parcelable.Creator<VerifierInfo>() {
        public VerifierInfo createFromParcel(Parcel source) {
            return new VerifierInfo(source);
        }

        public VerifierInfo[] newArray(int size) {
            return new VerifierInfo[size];
        }
    };
}
