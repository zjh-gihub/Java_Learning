package Heima.JiCheng.Cat_Dog;

public class Dog extends Aniaml {
    public Dog(){}

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
