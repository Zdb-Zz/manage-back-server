package com.zdb.demo.service.Impl;

import com.zdb.demo.service.PicService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service("picService")
public class PicServiceImpl  implements PicService {
    
    public static final String PICTUREURL = "E:/pic/";
    public static final String CONFIGUREURL = "E:/pic/";
    @Override
    public Map<String,Object> addPic(MultipartFile file,MultipartFile img1,MultipartFile img2,MultipartFile img3) {
        Map<String,Object> map =new HashMap<>();
        if (file!=null){
            map.put("imgview",fileReturn(file));
        }else {
            map.put("imgview",null);
        }
        if (img1!=null){
            map.put("img1",fileReturn(img1));
        }else {
            map.put("img1",null);
        }
        if (img2!=null){
            map.put("img2",fileReturn(img2));
        }else {
            map.put("img2",null);
        }
        if (img3!=null){
            map.put("img3",fileReturn(img3));
        }else {
            map.put("img3",null);
        }



        return map;
    }

    public String fileReturn(MultipartFile file){
        String filename = file.getOriginalFilename() + ".jpg";//生成唯一图片路径
        if (!file.isEmpty()) {
            try {
                File filepath = new File(PICTUREURL);
                if (!filepath.exists())
                    filepath.mkdirs();
                // 文件保存路径
                String savePath = PICTUREURL + filename;
                // 转存文件
                file.transferTo(new File(savePath));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String url = CONFIGUREURL + filename;
        return url;
    }
}
