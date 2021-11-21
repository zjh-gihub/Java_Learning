package Heima.BiaoZhunLei;

public class Student {

    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student(){}      //无参构造
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    //成员方法
    //1.提供get，set方法
    public void setAge(int age ){
       this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void show(){
        System.out.println(name+","+age);
    }

}

