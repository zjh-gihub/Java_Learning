package Heima.Interface.Example2;

public abstract class Sportsman extends Person{
    public Sportsman() {
    }

    public Sportsman(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
