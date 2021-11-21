package Heima.ZiFuChuan;

import java.util.Scanner;

public class FanZhuanZiFuChuan {
    public static void main(String[] args) {
        //导入Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要反转的字符串：");
        String s = sc.nextLine();

        String recerse = Recerse(s);
        System.out.println(recerse);
    }

    //反转方法
    /*
        返回对象：字符串
        参数： 字符串
    */
    public static String Recerse(String s){
        String ns = "";
        ns+="[";
        for(int i=s.length()-1;i>=0;i--){
            if (i == 0){
                ns+=s.charAt(i);
            }else{
                ns+=s.charAt(i);
                ns+=",";
            }
        }
        ns+="]";
        return ns;
    }
}
