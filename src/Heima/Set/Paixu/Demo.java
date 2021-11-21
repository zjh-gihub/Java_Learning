package Heima.Set.Paixu;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("A", 29);
        Student s2 = new Student("B", 28);
        Student s3 = new Student("C", 30);
        Student s4 = new Student("D", 33);

        Student s5 = new Student("A",29);
        Student s6 = new Student("E",33);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
