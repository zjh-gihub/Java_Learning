package Heima.Set.Hash.Anli1;

import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<Student> hs = new HashSet<Student>();

        //创建学生对象

        Student s4 = new Student("A", 33);
        Student s5 = new Student("B",21);
        Student s6  = new Student("B",21);

        //把学生添加到集合
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);

        //遍历集合(增强for)
        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
