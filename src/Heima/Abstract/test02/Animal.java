package Heima.Abstract.test02;

public abstract class Animal {
    //抽象类
    private int age = 20;
    private final String city = "beijing";

    //无参构造方法
    public Animal(){}

    //有参构造方法
    public Animal(int age) {
        this.age = age;
    }

    //非抽象方法
    public void show(){
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }

    //抽象方法
    public abstract void eat();
}
