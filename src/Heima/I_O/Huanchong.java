package Heima.I_O;

import java.io.*;

/*
    字节缓冲流：
        BufferOutputStream
        BufferedInputStream

    构造方法：
        字节缓冲输出流：BufferedOutputStream​(OutputStream out)
        字节缓冲输入流：BufferedInputStream​(InputStream in)
 */
public class Huanchong {
    public static void main(String[] args)throws IOException {
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Java_Learning\\Files\\Test\\1.txt"));
//
//        //写数据
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//
//        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\Java_Learning\\Files\\Test\\1.txt"));

        //读数据
        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }

        bis.close();


    }
}
