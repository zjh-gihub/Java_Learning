package Heima.I_O;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4:释放资源
 */
public class Copy_P {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("F:\\Java_Learning\\Files\\cat.jpg");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("F:\\Java_Learning\\Files\\Test\\copy_cat.jpg");

        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();
    }
}
