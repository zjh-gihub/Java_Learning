package Heima.Collection.AnLi;

import Heima.ArrayList.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Students> s = new ArrayList<Students>();

        //创建学生对象
        Students s1 = new Students("U",12);
        Students s2 = new Students("F",13);
        Students s3 = new Students("O",14);

        //把学生添加到集合
        s.add(s1);
        s.add(s2);
        s.add(s3);

        //遍历集合
        Iterator<Students> it = s.iterator();
        while (it.hasNext()){
            Students stu =it.next();
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
