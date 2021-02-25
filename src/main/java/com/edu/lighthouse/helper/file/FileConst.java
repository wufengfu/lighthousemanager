package com.edu.lighthouse.helper.file;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author jinzc
 * @date 2020/12/09
 */
public class FileConst {
    /**
     * 默认文件路径
     */
    public static final String DEFAULT_BUCKET_FILE_PATH = "default";
    /**
     * 默认上传的本地路径
     */
    public static final String DEFAULT_LOCAL_FILE_PATH = "/home/dev/upload/web-customer/";

    public static final List<String> DEFAULT_IMG_TYPE = ImmutableList.of("jpg", "jpeg", "png");
    public static final List<String> DEFAULT_FILE_TYPE = ImmutableList.of("ppt", "pptx", "txt", "dicom", "xlsx", "rar", "zip", "doc", "docx", "pdf", "apk");
}
