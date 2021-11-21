package Heima.Args;

public class JumpingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumpingOprator jo = new JumpingOprator();
        Jumping j = new Cat();
        jo.useJumping(j);

        Jumping j2 = jo.getJumping();
        j2.jump();
    }
}
