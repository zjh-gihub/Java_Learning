package Heima.Files.test02;

import java.io.File;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {

        File f = new File("F:\\Java_Learning\\Files\\test02.java");
        f.createNewFile();
        System.out.println(f.isDirectory());//false
        System.out.println(f.isFile());//true
        System.out.println(f.exists());//true
        System.out.println("---------------");

        System.out.println(f.getAbsolutePath());//F:\Java_Learning\Files\test02.java
        System.out.println(f.getPath());//F:\Java_Learning\Files\test02.java
        System.out.println(f.getName());//test02.java
        System.out.println("---------------");

        File f2 = new File("F:\\Java_Learning\\Files");
        String[] str = f2.list();
        for (String s:str){
            System.out.println(s);
        }
        /* 输出该路径下所有目录and文件
            java.txt
            Test
            test02.java
          */

        System.out.println("---------------");
        File [] fileArray = f2.listFiles();
        for(File file:fileArray){
            System.out.println(file);
//            if(file.isFile()){//判断是不是文件
//                System.out.println(file.getName());
//            }
        }
        /* 输出该路径下所有目录and文件路径全称
        F:\Java_Learning\Files\java.txt
        F:\Java_Learning\Files\Test
        F:\Java_Learning\Files\test02.java
        */




    }
}
