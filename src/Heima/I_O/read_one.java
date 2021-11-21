package Heima.I_O;

import java.io.FileInputStream;

import java.io.IOException;

/*
    需求：
        把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream：从文件系统中的文件获取输入字节
        FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name命名

    使用字节输入流读数据的步骤：
        1:创建字节输入流对象
        2:调用字节输入流对象的读数据方法
        3:释放资源
 */
public class read_one {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
//        FileOutputStream fis = new FileOutputStream("F:\\Java_Learning\\Files\\Test\\1.txt");
        FileInputStream fis = new FileInputStream("F:\\Java_Learning\\Files\\Test\\1.txt");


        //调用字节输入流对象的读数据方法
//        int rd = fis.read();
//        System.out.println(rd);
//        System.out.println((char)rd);

        //
        int bys;
        while((bys=fis.read())!=-1){
            System.out.print(bys);
//            System.out.println();
            System.out.print((char)bys);
            System.out.println();
        }

        fis.close();

    }
}
