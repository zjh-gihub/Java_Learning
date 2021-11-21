package Heima.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AnLi3 {

    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> arr = new ArrayList<Student>();
        addStudent(arr);
        addStudent(arr);
        addStudent(arr);

        BianLi(arr);
    }
    //方法 返回值类型：void，参数：ArrayList<Student> array
    public static void addStudent(ArrayList<Student> arr){
        //键盘录入学生对象数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        //创建学生对象
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        //往集合中添加学生对象
        arr.add(s);
    }

    ////遍历集合方法 返回值类型 void 参数ArrayList<Studnet> arr
    public static void BianLi(ArrayList<Student> arr){
        Student s1 = new Student();
        for (int i = 0;i<arr.size();i++){
            s1 = arr.get(i);
            System.out.println("name:"+s1.getName()+","+"age:"+s1.getAge());
        }
    }
}
