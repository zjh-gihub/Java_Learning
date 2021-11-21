package Heima.List.Anli2;
/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建List集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            迭代器：集合特有的遍历方式
            普通for：带有索引的遍历方式
            增强for：最方便的遍历方式
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //创建List集合对象
        List<Student> stu = new ArrayList<Student>();

        //创建学生类对象
        Student s1 = new Student("A",12);
        Student s2 = new Student("B",13);
        Student s3 = new Student("C",14);

        //把学生类添加到List
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);


        //迭代器：集合特有的遍历方式
        Iterator<Student> it = stu.iterator();
        while(it.hasNext()){
            Student n = it.next();
            System.out.println(n.getName()+","+n.getAge());
        }
        System.out.println("-------------------");

        //普通for：带有索引的遍历方式
        for(int i=0;i<stu.size();i++){
            Student sa = stu.get(i);
            System.out.println(sa.getName()+","+sa.getAge());
        }
        System.out.println("-------------------");

        //增强for：最方便的遍历方式
        for(Student s:stu){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
