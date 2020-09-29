package com.zdb.demo.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface PicService {

    Map<String,Object> addPic(MultipartFile file, MultipartFile file1, MultipartFile file2, MultipartFile file3);
}
