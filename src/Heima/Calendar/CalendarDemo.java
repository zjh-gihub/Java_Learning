package Heima.Calendar;

import java.util.Calendar;

/*
    Calendar 为特定瞬间与一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法

    Calendar 提供了一个类方法 getInstance 用于获取这种类型的一般有用的对象，该方法返回一个 Calendar 对象，
    其日历字段已使用当前日期和时间初始化：Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();//多态形式常见对象
        System.out.println(c);

        //public int get(int filed)
        int year = c.get(Calendar.YEAR);
        int mouths = c.get(Calendar.MONTH)+1;
        int days = c.get(Calendar.DATE);
        System.out.println(year+"Year"+mouths+days);

    }
}
