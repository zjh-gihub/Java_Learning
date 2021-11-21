package Heima.Shiping;

public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }

    public static void isEvenNumber () {
        //定义变量
        int number = 10;

        //判断该数据是否为偶数
        if (number%2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

