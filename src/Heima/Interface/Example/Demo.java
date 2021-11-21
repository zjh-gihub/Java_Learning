package Heima.Interface.Example;

public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("-------------------");

        Animal a = new Cat("jiafei",1);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("-------------------");

        //一般使用的时候是使用具体的实用类，因为它里面有最多的方法
        Cat c = new Cat();
        c.setName("12121");
        c.setAge(12);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
