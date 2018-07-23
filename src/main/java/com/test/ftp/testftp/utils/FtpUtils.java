
package com.test.ftp.testftp.utils;


import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;

/**
 * ftp服务的连接
 *
 * @author :breakpoint/赵立刚
 * @date : 2018/07/23 14:30:44
 */

public class FtpUtils {

    public static void main(String[] args) throws Exception {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("47.95.230.115");
        ftpClient.login("vsftpd","vsftpd");
        int replyCode = ftpClient.getReplyCode();
        FTPFile[] ftpFiles = ftpClient.listFiles();
        for (FTPFile ftpFile:ftpFiles){
            System.out.println(ftpFile.getName());
            System.out.println(ftpFile.isDirectory());
        }
        System.out.println(replyCode);
    }
}

