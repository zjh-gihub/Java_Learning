package Heima.DuoTai.test01;
/*
* 这是测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("jia",14);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }

}
