package Heima.Interface.Example2;

import java.time.Year;

public class NBASportsman extends Sportsman {
    public NBASportsman() {
    }

    public NBASportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("NBA球员在吃饭");
    }

    @Override
    public void study() {
        System.out.println("NBA球员在学习");
    }
}
