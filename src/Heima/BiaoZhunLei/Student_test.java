package Heima.BiaoZhunLei;

public class Student_test {
    public static void main(String[] args) {
        //1.无参构造方法创建对象后使用setXXX（）赋值
        Student s1 = new Student();
        s1.setName("Mr");
        s1.setAge(19);
        s1.show();


        //2.使用有参构造方法直接创建带有属性值的对象
        Student s2 = new Student("mr",19);
        s2.show();
    }
}
