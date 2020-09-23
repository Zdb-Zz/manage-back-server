package com.zdb.demo.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 上传图片工具类（需要根据上传的name创建一个文件夹来存放图片）
 * @author Administrator
 *
 */
public class UploadFileUtil {
	
	/**
	 * 自定义文件夹上传
	 * @param upPath
	 * @param myfile
	 * @param dirName 文件夹名称
	 * @return
	 * @throws Exception
	 */
	public static String upload(String upPath, MultipartFile myfile, String dirName)throws Exception{
//		String newName = null;
//		if(!ts.isEmpty()){
//			//获取服务器路径
//			String path = upPath + "//upload//"+ts.getName()+"//";
//			//获取原文件名 避免文件名重复覆盖
//			String oldName = ts.getOriginalFilename();
//			//通过UUID来创建新的文件名
//			newName = UUID.randomUUID() + oldName.substring(oldName.lastIndexOf("."));
//			path +=newName;
//			File file = new File(path);
//			ts.transferTo(file);
//		}
//		return newName;
		dirName = dirName == null ? "" : dirName;
		List<String> imgPathList = new ArrayList<String>();
            if(myfile.isEmpty()){  
                System.out.println("文件未上传");  
            }else{  
                System.out.println("文件长度: " + myfile.getSize());  
                System.out.println("文件类型: " + myfile.getContentType());  
                System.out.println("文件名称: " + myfile.getName());  
                System.out.println("文件原名: " + myfile.getOriginalFilename());  
                System.out.println("========================================");  
                
                //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中  
//                String realPath = request.getSession().getServletContext().getRealPath("/upload"); 
                //使用自定义文件资源库
                String realPath = upPath+"/"+dirName;
//                String realPath = upPath;
                //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的  
                try {
                	//重置文件名
                	Long nowTime = System.currentTimeMillis();
                	String[] originalFileName = myfile.getOriginalFilename().split("\\.");
//                	String fileName = originalFileName[0]+"."+originalFileName[1];
                	//String fileName = nowTime + "." + originalFileName[1];
                	String fileName = nowTime + "." + originalFileName[originalFileName.length - 1];
                	System.out.println("fileName:"+fileName);
					FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, fileName));
					//配置图片访问路径
					if (dirName.equals("")) {
						imgPathList.add(upPath+fileName);
					} else {
						imgPathList.add(upPath+dirName+"/"+fileName);
					}
                } catch (IOException e) {
					e.printStackTrace();
					return null;
				}  
            }  
		
		return imgPathList.get(0);
	}
	
	/**
	 * 根据工程id来划分上传路径
	 * @param upPath
	 * @param myfile
	 * @return
	 * @throws Exception
	 */
	public static String upload(String upPath, String dir, MultipartFile myfile, String name)throws Exception{
		List<String> imgPathList = new ArrayList<String>();
		if(myfile.isEmpty()){  
	        System.out.println("文件未上传");  
	    }else{ 
	    	System.out.println("文件长度: " + myfile.getSize());  
            System.out.println("文件类型: " + myfile.getContentType());  
            System.out.println("文件名称: " + myfile.getName());  
            System.out.println("文件原名: " + myfile.getOriginalFilename());  
            System.out.println("========================================"); 
            try {
            	//根据工程id分开
            	String path = "/" + dir + "/" + name;
            	String filePath = upPath + path;
            	File dirFile = new File(filePath);
            	if(!dirFile.exists() || !dirFile .isDirectory()){
            		dirFile.mkdirs();
            	}
            	//重置文件名
            	Long nowTime = System.currentTimeMillis();
            	int lastPoint = myfile.getOriginalFilename().lastIndexOf(".");
            	//文件原名
            	String originalFileName = myfile.getOriginalFilename();
            	//加上时间戳防止重名
            	String fileName = originalFileName.substring(0, lastPoint) + nowTime + originalFileName.substring(lastPoint,originalFileName.length());
            	FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(filePath,fileName));
            	//配置访问路径					
				imgPathList.add("upload"+path+"/"+fileName);
            }catch (IOException e){
            	e.printStackTrace();
				return null;
            }
	    }
		return imgPathList.get(0);
	}
	
}
