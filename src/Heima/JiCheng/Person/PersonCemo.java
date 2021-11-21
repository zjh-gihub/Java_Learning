package Heima.JiCheng.Person;

public class PersonCemo {
    public static void main(String[] args) {
        Teachers t1 = new Teachers();
        t1.setAge(26);
        t1.setName("大哥");
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teachers t2 = new Teachers("二哥",18);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

    }
}
