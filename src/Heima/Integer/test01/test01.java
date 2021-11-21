package Heima.Integer.test01;

public class test01 {
    public static void main(String[] args) {
        //public static Integer valueOf​(int i)：返回表示指定的 int 值的 Integer 实例
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        //public static Integer valueOf​(String s)：返回一个保存指定值的 Integer 对象 String
        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);

        //报错：NumberFormatException
//        Integer i5 = Integer.valueOf("abv");
//        System.out.println(i5);

        // int---String
        int number = 10000;
        //方式1
        String s1 = ""+number;
        System.out.println(s1);
        //方式2
        //public static String valueOf(int i)
        String s2 = String.valueOf(1000000);
        System.out.println(s2);


        //String---int
        String s = "666";
        //方式1：String --- Integer --- int
        Integer i = Integer.valueOf(s);
        //public int intValue​()
        int x = i.intValue();
        System.out.println(x);
        //方式2
        //public static int parseInt​(String s)
        int y = i.parseInt(s);
        System.out.println(y);

    }
}
