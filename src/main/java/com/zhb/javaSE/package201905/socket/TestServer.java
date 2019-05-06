package com.zhb.javaSE.package201905.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: StudyJava
 * @description: 服务端
 * @author: rainboz
 * @create: 2019-05-05 15:00
 **/
public class TestServer {
    public static void main(String[] args) throws IOException {
        //创建服务端Socket对象
        ServerSocket s = new ServerSocket(10010);
        //监听,阻塞等待客户端发送数据
        Socket socket = s.accept();
        //获取输入流对象
        InputStream is = socket.getInputStream();
        //获取数据
        byte[] bytes = new byte[1024];
        int len;//用于存储读取到的字节数量
        len = is.read(bytes);
        //输出数据
        String str = new String(bytes, 0, len);
        System.out.println(str);

        //转换数据
        String upperCase = str.toUpperCase();
        //获取输出流对象
        OutputStream out = socket.getOutputStream();
        //返回数据
        out.write(upperCase.getBytes());

        //释放资源
        socket.close();
//        s.close();//服务端一般不关闭
    }
}
