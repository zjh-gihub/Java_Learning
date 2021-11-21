package Heima.List.Anli1;

import java.util.ArrayList;
import java.util.List;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建List集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式，for循环方式)
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建List集合对象
        List<Student> s = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("A",11);
        Student s2 = new Student("B",12);
        Student s3 = new Student("C",13);

        //把学生添加到集合
        s.add(s1);
        s.add(s2);
        s.add(s3);

        //遍历集合-迭代器方式
//        Iterator<Student> i = s.iterator();
//        while(i.hasNext()){
//            Student stu = i.next();
//            System.out.println(stu.getName()+","+stu.getAge());
//        }

        //遍历集合-for循环方式
        for(int i=0;i<s.size();i++){
            Student stu = s.get(i);
            System.out.println(stu.getName()+","+stu.getAge());

        }

    }
}
