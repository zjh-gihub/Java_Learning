package Heima.JiCheng.Cat_Dog;

public class Anima_Demo {
    //test
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(2);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catMouse();

        Cat c2 = new Cat("Tom",1);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catMouse();

        Dog d1 = new Dog("dog",3);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookDoor();
    }
}
