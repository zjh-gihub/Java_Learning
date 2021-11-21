package Heima.Interface.Example;

public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    @Override
    public void jump() {
        System.out.println("狗真能跳");
    }
}
