package com.edu.lighthouse.helper.file;

import com.google.common.collect.Maps;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;


/**
 * 文件上传类
 * @author jinzc
 * @date 2020/12/09
 */
public class Uploader {

    private String fileBaseUrl;

    public Uploader() {}

    /**
     * 上传文件至本地
     *
     * @param partFile
     * @return
     * @throws IOException
     */
    public Map<String, String> upload2Local(MultipartFile partFile) {
        String name = partFile.getOriginalFilename();
        String type = name.trim().substring(name.lastIndexOf(".") + 1);
        Map<String, String> map = Collections.EMPTY_MAP;
        if (FileConst.DEFAULT_FILE_TYPE.contains(type) || FileConst.DEFAULT_IMG_TYPE.contains(type)) {
            String filename = String.format("%s.%s", System.currentTimeMillis(), type);
            File file = new File(FileConst.DEFAULT_LOCAL_FILE_PATH, filename);
            try {
                partFile.transferTo(file);
            } catch (IOException e) {
                return map;
            }
            map = Maps.newHashMap();
            map.put("name", name.subSequence(0, name.lastIndexOf(".")).toString());
            map.put("filename", name);
            map.put("filePath", String.format("file/%s", filename));
            map.put("type", FileConst.DEFAULT_IMG_TYPE.contains(type) ? "img" : "file");
            map.put("ext", type);
        }
        return map;
    }


    /**
     * 校验文件合法性
     *
     * @param file 文件实体对象
     * @return 是否合法
     */
    private Boolean check(MultipartFile file) {
        if (file.isEmpty()) {
            return false;
        }
        String originName = file.getOriginalFilename();
        String ext = originName.substring(originName.lastIndexOf(".") + 1);
        boolean isValidImg = FileConst.DEFAULT_IMG_TYPE.contains(ext);
        boolean isValidDoc = FileConst.DEFAULT_FILE_TYPE.contains(ext);
        return isValidDoc || isValidImg;
    }

    /**
     * 重命名
     *
     * @param name 原命名
     * @return 新命名
     */
    private String rename(String name) {
        String type = name.trim()
                .substring(name.lastIndexOf(".") + 1);
        name = String.format("%s.%s", UUID.randomUUID(), type);
        return name;
    }

    /**
     * 组装上传后结果
     *
     * @param filename 新文件名
     * @param filepath oss bucket 中路径（文件夹名)
     * @return Map集合，包含：新文件名、oss基础url，文件url
     */
    private Map<String, String> buildResult(String filename, String filepath) {
        String filePath = String.format("%s/%s", filepath, filename);
        String fileUrl = String.format("%s%s", fileBaseUrl, filePath);
        String name = filename.substring(0, filename.lastIndexOf("."));
        String type = filename.substring(filename.lastIndexOf("."));
        Map<String, String> result = Maps.newHashMap();
        result.put("name", name);
        result.put("filename", filename);
        result.put("filePath", fileUrl);
        result.put("type", FileConst.DEFAULT_IMG_TYPE.contains(type) ? "img" : "file");
        result.put("ext", type);
        return result;
    }
}

