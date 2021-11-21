package Heima.ArrayList;

import java.util.ArrayList;

public class Anli2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> arr = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("a",12);
        Student s2 = new Student("a2",13);
        Student s3 = new Student("a3",14);

        //添加对象到集合中
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        //遍历集合
        for(int i = 0;i<arr.size();i++){
            Student s = arr.get(i);
            System.out.println("name:"+s.getName()+","+"age:"+s.getAge());
        }




    }
}
