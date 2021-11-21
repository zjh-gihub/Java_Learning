package Heima.Collection.Demo1;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class Demo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c =new ArrayList<String>();

        ////添加元素：boolean add​(E e)
        c.add("uiou");
        c.add("ui");

        //输出集合
        System.out.println(c);

    }
}
