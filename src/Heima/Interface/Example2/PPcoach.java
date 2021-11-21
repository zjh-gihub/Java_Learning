package Heima.Interface.Example2;

public class PPcoach extends Coach implements SpeakE{
    public PPcoach() {
    }

    public PPcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练在吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教学");
    }

    @Override
    public void speakEg() {
        System.out.println("乒乓球教练在说英语");
    }
}
