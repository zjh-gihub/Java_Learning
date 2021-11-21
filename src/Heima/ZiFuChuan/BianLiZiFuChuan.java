package Heima.ZiFuChuan;

import java.util.Scanner;

public class BianLiZiFuChuan {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String s = sc.nextLine();

        //遍历字符串
        for(int i =0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}
