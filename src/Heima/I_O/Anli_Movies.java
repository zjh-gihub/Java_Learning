package Heima.I_O;
/*
*    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4:释放资源

    四种方式实现复制视频，并记录每种方式复制视频的时间
        1:基本字节流一次读写一个字节
        2:基本字节流一次读写一个字节数组
        3:字节缓冲流一次读写一个字节
        4:字节缓冲流一次读写一个字节数组
 */

import java.io.*;

public class Anli_Movies {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();
//        method1();
        method4();

        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");



    }

    public static void method4 ()throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\Java_Learning\\Files\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Java_Learning\\Files\\Test\\2.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

    }

    public static void method3 ()throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\Java_Learning\\Files\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Java_Learning\\Files\\Test\\2.mp4"));

        int by;
        while((by=bis.read())!=-1){
            bos.write(by);
        }

        bis.close();
        bos.close();

    }

    public static void method2 ()throws IOException{

        FileInputStream fis = new FileInputStream("F:\\Java_Learning\\Files\\1.mp4");

        FileOutputStream fos = new FileOutputStream("F:\\Java_Learning\\Files\\Test\\2.mp4");

        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();

    }

    public static void method1 ()throws IOException{

        FileInputStream fis = new FileInputStream("F:\\Java_Learning\\Files\\1.mp4");

        FileOutputStream fos = new FileOutputStream("F:\\Java_Learning\\Files\\Test\\2.mp4");

        int by ;
        while((by=fis.read())!=-1){
            fos.write(by);
        }

        fos.close();
        fis.close();

    }
}

