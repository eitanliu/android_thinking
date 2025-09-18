import xml.etree.ElementTree as ET
import os
import json

def parse_xml_strings(file_path):
    """
    解析XML文件，提取string和string-array的name属性
    """
    tree = ET.parse(file_path)
    root = tree.getroot()
    
    strings = []
    string_arrays = []
    
    # 查找所有string元素
    for string_elem in root.findall('string'):
        name = string_elem.get('name')
        if name:
            strings.append(name)
    
    # 查找所有string-array元素
    for array_elem in root.findall('string-array'):
        name = array_elem.get('name')
        if name:
            string_arrays.append(name)
    
    return strings, string_arrays

def main():
    # 修改: 将file_path改为列表形式，并添加donottranslate-cldr.xml文件
    file_paths = [
        '~/Library/Android/sdk/platforms/android-35/data/res/values/strings.xml',
        '~/Library/Android/sdk/platforms/android-35/data/res/values/donottranslate-cldr.xml'
    ]
    
    # 存储所有解析结果
    all_strings = []
    all_string_arrays = []
    
    for file_path in file_paths:
        # 修改: 使用os.path.expanduser来正确解析用户目录路径
        expanded_file_path = os.path.expanduser(file_path)
        
        try:
            strings, string_arrays = parse_xml_strings(expanded_file_path)
            all_strings.extend(strings)
            all_string_arrays.extend(string_arrays)
                
        except FileNotFoundError:
            print(f"文件未找到: {file_path}")
        except ET.ParseError as e:
            print(f"XML解析错误: {e}")

    # 输出格式为使用双引号的列表形式
    # print(f"String names: {json.dumps(all_strings)}")
    # print(f"String-array names: {json.dumps(all_string_arrays)}")
    
    # 输出格式为Kotlin的arrayOf语法
    string_names_str = ', '.join(f'"{name}"' for name in all_strings)
    string_array_names_str = ', '.join(f'"{name}"' for name in all_string_arrays)
    
    print(f"val stringNames = arrayOf({string_names_str})")
    print(f"val stringArrayNames = arrayOf({string_array_names_str})")

if __name__ == "__main__":
    main()