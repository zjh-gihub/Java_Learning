package Heima.Set.Anli;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
        要求：按照总分从高到低出现

    思路：
        1:定义学生类
        2:创建TreeSet集合对象，通过比较器排序进行排序
        3:创建学生对象
        4:把学生对象添加到集合
        5:遍历集合
 */

public class test {
    public static void main(String[] args) {
        TreeSet<Student> st = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

//                return 0;

                //主要条件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s1.getCg() - s2.getCg() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("q", 98, 100);
        Student s2 = new Student("w", 95, 95);
        Student s3 = new Student("e", 100, 93);
        Student s4 = new Student("r", 100, 97);
        Student s5 = new Student("t", 98, 98);

        Student s6 = new Student("p", 97, 99);
        Student s7 = new Student("p", 97, 99);

        //把学生对象添加到集合
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);

        //遍历集合
        for (Student s : st) {
            System.out.println(s.getName() + "," + s.getCg() + "," + s.getMg() + "," + s.getSum());
        }
    }
}


