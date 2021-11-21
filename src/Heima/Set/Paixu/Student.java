package Heima.Set.Paixu;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        //返回0认为重复不添加，返回1按顺序升序，返回-1按顺序降序
//        return 0;
//        return 1;

        //按照年龄升序排列
//        int a=this.age;
//        int b =s.age;
/**        执行第一个add时，this.age和s.age都是指向29（s1）
        执行第二个add是，this.age指向28(s2)，s.age指向29（s1）*/
        int num = this.age-s.age;
//        int num s.age-this.age;//降序

        //按照年龄，姓名排序
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;


    }
}
