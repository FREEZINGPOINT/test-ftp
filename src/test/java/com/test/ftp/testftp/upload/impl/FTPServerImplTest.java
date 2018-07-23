package com.test.ftp.testftp.upload.impl;

import com.test.ftp.testftp.upload.IFTPServer;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;

/**
 * @author :breakpoint/赵立刚
 * @date : 2018/07/23 15:45:02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/ftp-context.xml"})
public class FTPServerImplTest {

    @Resource(name = "ftpServer")
    IFTPServer iftpServer;


    @Test
    public void uploadFile() throws Exception {
        FileInputStream inputStream = new FileInputStream("/Users/breakpoint/Downloads/Snip20180720_15.png");
        boolean b = iftpServer.uploadFile("/test/", "test.png", inputStream);
        boolean ki = iftpServer.downloadFile("/test/", "test.png");

        System.out.println(ki);

    }

}