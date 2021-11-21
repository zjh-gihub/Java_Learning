package Heima.Lei;

public class Student {

    //成员变量
    private String name;
//    int age;
    private int age;

    //提供get，set方法
    public void setAge(int a ){
        age = a;
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

    //成员方法
    public  void  study(){
        System.out.println("Good");
    }

    public void doHomework(){
        System.out.println("Gan");
    }
    public void show(){
        System.out.println(name+","+ age);
    }
}
