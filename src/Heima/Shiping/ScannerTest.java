package Heima.Shiping;

//导包
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        //身高位置采用键盘录入
        Scanner sc = new Scanner(System.in);

        //键盘输入分别赋值
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();

        //三元运算符进行比较求最高
        int tempheight = (height1 > height2) ? height1 : height2;
        int maxheight = (tempheight > height3) ? tempheight : height3;

        System.out.println("最高的和尚身高："+maxheight);
    }
}
