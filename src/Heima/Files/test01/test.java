package Heima.Files.test01;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        //创建单级目录
        File f1 = new File("F:\\Java_Learning\\Files");
        System.out.println(f1.mkdir());

        //创建多集目录
        File f2 = new File("F:\\Java_Learning\\Files\\Test\\test\\01");
        System.out.println(f2.mkdirs());

        //创建文件
        File f3 = new File("F:\\Java_Learning\\Files\\java.txt");
        System.out.println(f3.createNewFile());
    }
}
