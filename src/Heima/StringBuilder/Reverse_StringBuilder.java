package Heima.StringBuilder;

import java.util.Scanner;

public class Reverse_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String s = sc.nextLine();

        String S_r = S_reverse(s);
        System.out.println("S_Reverse:"+S_r);
    }

    //调用方法：返回值：String  参数：字符串
    //过程：String - StringBuilder - reverse - String
    public static String S_reverse(String s){
        //方法一
/*        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        String s2 = s1.toString();
        return s2;*/

        //方法二
        return new StringBuilder(s).reverse().toString();

    }
}
