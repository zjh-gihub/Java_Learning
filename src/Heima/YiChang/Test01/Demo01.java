package Heima.YiChang.Test01;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("访问数组长度过长");
            e.printStackTrace();
        }

    }
}
