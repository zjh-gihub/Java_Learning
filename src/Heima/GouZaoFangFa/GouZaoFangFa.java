package Heima.GouZaoFangFa;



public class GouZaoFangFa {
    private String name;
    private int age;

    //构造方法
//    public GouZaoFangFa(){
//        System.out.println("无参构造方法");
//    }
    public GouZaoFangFa(){};

    public GouZaoFangFa(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name + "," + age);
    }
}
