package Heima.Lei;

import sun.security.mscapi.CPublicKey;

public class Stuent_test {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用对象

        s.setAge(30);
        int age = s.getAge();
        System.out.println("age:"+age);
        s.show();

        s.setName("Mr");
        s.show();


    }


}
