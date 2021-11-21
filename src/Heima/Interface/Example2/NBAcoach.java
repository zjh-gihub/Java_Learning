package Heima.Interface.Example2;

import com.sun.media.jfxmediaimpl.HostUtils;

public class NBAcoach extends Coach {
    public NBAcoach() {
    }

    public NBAcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("NBA教练在吃饭");
    }

    @Override
    public void teach() {
        System.out.println("NBA教练教学");
    }
}
