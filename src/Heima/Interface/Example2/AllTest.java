package Heima.Interface.Example2;

public class AllTest {
    public static void main(String[] args) {
        PPcoach a = new PPcoach("胖子",45);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a.speakEg();
        a.teach();
    }
}
