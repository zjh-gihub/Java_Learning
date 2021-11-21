package Heima.Interface.Example2;

public class PPSportsman extends Sportsman implements SpeakE {
    public PPSportsman() {
    }

    public PPSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员在吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习");
    }

    @Override
    public void speakEg() {
        System.out.println("乒乓球运动员在说英语");
    }
}
