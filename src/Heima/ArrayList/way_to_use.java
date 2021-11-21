package Heima.ArrayList;

import java.util.ArrayList;

public class way_to_use {
    public static void main(String[] arrgs){
        //ArrayList构造方法
/*        ArrayList<String> arr = new ArrayList<String>();

        //添加方法
        arr.add("hello");
        arr.add("name");
        arr.add("dog");

        //指定位置索引添加
        arr.add(1,"0000");

        System.out.println("arr:"+arr);*/

        ArrayList<String> arr = new ArrayList<String>();

        //添加方法
        arr.add("hello");
        arr.add("name");
        arr.add("dog");

        //public boolean remove(Objiect o):删除指定元素，返回删除后的集合
//        arr.remove("dog");

        //public E remove(int index):删除指定索引元素，返回被删除的元素
//        arr.remove(2);

        //public E set(int index,Eelement):删除指定索引处的元素，返回被修改的元素
//        arr.set(1,"hhhh");

        // public E get(int index):返回指定索引出的元素
//        arr.get(3);

        //public int size():返回集合中元素的个数
        int l = arr.size();
        System.out.println("ayy:"+arr);
        System.out.println("ayy.length:"+l);

    }

}
