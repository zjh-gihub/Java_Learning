package Heima.YiChang.ZiDingYi;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入分数：");

    int score = sc.nextInt();

    Teachers t = new Teachers();
    try {
        t.checkScore(score);
    } catch (ScoreException e) {
        e.printStackTrace();
    }
    }
}
