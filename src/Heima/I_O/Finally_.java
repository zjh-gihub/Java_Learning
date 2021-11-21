package Heima.I_O;

import java.io.FileOutputStream;
import java.io.IOException;

public class Finally_ {
    public static void main(String[] args) {
        //加入finally来实现释放资源

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("F:\\Java_Learning\\Files\\Test\\1.txt");
            fos.write("heo".getBytes());
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}