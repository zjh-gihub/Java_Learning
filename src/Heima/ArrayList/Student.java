package Heima.ArrayList;

public class Student {
    //成员对象
    private String name;
    private int age;

    //构造方法
    public Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    //成员方法 提供get set方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
