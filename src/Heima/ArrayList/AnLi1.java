package Heima.ArrayList;

import java.util.ArrayList;

public class AnLi1 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> arr =new  ArrayList<String>();

        //在集合中添加字符串
        arr.add("hello");
        arr.add("name");
        arr.add("dog");

        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
