package com.zhb.javaSE.package201905.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @program: StudyJava
 * @description: 客户端: 使用TCP协议发送数据，并将接收的数据换成大写返回
 * 客户端发送数据
 * 服务端接收数据
 * 服务端转换数据
 * 服务端发送数据
 * 客户端接收数据
 * @author: rainboz
 * @create: 2019-05-05 15:01
 **/
public class TestClient {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket socket = new Socket(InetAddress.getByName("localhost"), 10010);
        //获取输出流对象
        OutputStream out = socket.getOutputStream();
        //发送数据
        out.write("tcp,im comming again!!!".getBytes());

        //获取输入流对象
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;//用于存储读取到的字节数量
        //接收数据
        len = is.read(bytes);
        //输出数据
        System.out.println(new String(bytes, 0, len));

        //释放资源
        socket.close();

    }
}
