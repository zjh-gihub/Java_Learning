package Heima.Shiping;
/*数据输入：
    导包
        import java.util.Scanner;
    创建对象：
        Scanner sc = new Scanner (System.in);
    接收数据：
        int x = sc.nextInt();
                */
//导包
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner (System.in);

        //接收数据
        int x = sc.nextInt();
        System.out.println("x:"+x);
    }
}
