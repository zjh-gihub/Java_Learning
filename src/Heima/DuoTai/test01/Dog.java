package Heima.DuoTai.test01;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("狗在吃饭");
    }
}
