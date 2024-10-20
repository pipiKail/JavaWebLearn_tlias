package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName: UploadController
 * @Description:
 * @Author: Kai
 * @Date: 2024/10/13 12:15
 * @Version: 1.0
 */

@RestController
@Slf4j
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;

   /* @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
        log.info("文件上传:{},{},{}", username, age, image);

        String originalFilename = image.getOriginalFilename();
        int index = originalFilename.lastIndexOf(".");
        String extname=originalFilename.substring(index);
        String fileName = UUID.randomUUID().toString() + extname;
        log.info("文件名:{}", fileName);

        image.transferTo(new File("F:/test/"+ fileName));


        return Result.success();
    }*/


    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws Exception {
        log.info("文件上传:{}", image.getOriginalFilename());


        String url = aliOSSUtils.upload(image);
        log.info("文件上传完成，文件访问的url:{}", url);


        return Result.success(url);
    }
}
