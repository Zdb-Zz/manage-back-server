package com.zdb.demo.controller;


import com.zdb.demo.service.PicService;
import com.zdb.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Slf4j
@Scope("prototype")
@RestController
@RequestMapping("/pic")
public class PicUpload {

    @Resource
    PicService picService;

    @PostMapping("/upload")
    public Map<String,Object> upload(@RequestParam(value = "file", required = false)MultipartFile file,
                                     @RequestParam(value = "img1", required = false)MultipartFile img1,
                                     @RequestParam(value = "img2", required = false)MultipartFile img2,
                                     @RequestParam(value = "img3", required = false)MultipartFile img3){
        Map<String,Object> path =picService.addPic(file,img1,img2,img3);
        if (path!=null ){
            return ResultUtil.resultSuccess("上传图片成功", null, path);
        }
        return ResultUtil.resultFail("上传图片失败", null,null);

    }
}
