package Heima.JiCheng;

public class Zi extends Fu{
    //Zi中的成员变量
    int num = 6;

    //Zi中的成员方法
    public void show() {
        int num = 7;
        //子父类中出现了同名的成员变量时
        //在子类中需要访问父类中非私有成员变量时，需要使用super关键字
        //访问父类中的num
        System.out.println("Fu num="+super.num);
        //访问子类中的num2
        System.out.println("Zi num="+this.num);
        //子方法num
        System.out.println("Zi fangfa num:"+num);
}
}
