package Heima.Date.Test;

import java.util.Date;
/*
    public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */

/*
    public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
    public void setTime(long time):设置时间，给的是毫秒值
 */

public class test {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();

        //public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        System.out.println(d.getTime()*1.0/1000/60/60/24/365+"年");

        //public void setTime(long time):设置时间，给的是毫秒值
//        long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);

        System.out.println(d);
    }
}
