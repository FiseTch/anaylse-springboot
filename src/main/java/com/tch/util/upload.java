package com.tch.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.io.IOException;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/14 14:13
 */
public class upload {
    
    public MultipartResolver multipartResolver() throws IOException {
    
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setUploadTempDir(new FileSystemResource("/tmp/"));
        multipartResolver.setMaxInMemorySize(0);
        multipartResolver.setMaxUploadSize(2097152);
        return multipartResolver;
    }
    
    
}
