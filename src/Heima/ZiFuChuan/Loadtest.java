package Heima.ZiFuChuan;

import java.util.Scanner;

public class Loadtest {
    public static void main(String[] args) {
        for(int i =0;i<3;i++){
            //定义用户名和密码
            String username = "110";
            String password = "119";

            //键盘录入
            Scanner s = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = s.nextLine();

            Scanner p = new Scanner(System.in);
            System.out.println("请输入密码：");
            String pass = p.nextLine();

            //比较内容是否相等
            if(name.equals(username) && pass.equals(password)){
                System.out.println("输入正确！");
                break;
            }
            else {
                if(2-i==0){
                    System.out.println("你的账户已锁定！");
                }else{
                    System.out.println("您的输入有误,"+"还有"+(2-i)+"次机会");
                }
            }
        }

    }
}
