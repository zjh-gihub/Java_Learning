package Heima.Abstract.Example;

public class Demo_example {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("jiafeimao");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Animal d = new Dog("皮卡丘",12);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

    }
}
