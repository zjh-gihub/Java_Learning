package Heima.JiCheng.Person;

public class Teachers extends Person {

    public Teachers (){}

    public Teachers(String name,int age){
//        this.name = name;
//        this.age = age;
        super(name,age);
    }
    public void teach(){
        System.out.println("用爱成就每一位成员");
    }
}
