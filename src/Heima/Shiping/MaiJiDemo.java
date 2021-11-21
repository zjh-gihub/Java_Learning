package Heima.Shiping;

public class MaiJiDemo {
    public static void main(String[] args) {
        //第一层循环，用于表示鸡翁的范围，初始化表达式变量定义为x=0,判断条件x<=20
        for(int x = 0;x<=20;x++){
            for(int y=0;y<=33;y++){
                int z=100-x-y;
                if (z%3==0 && 5*x+3*y+z/3==100){
                    System.out.println(x+","+y+","+z);
                }
            }
        }
    }
}
