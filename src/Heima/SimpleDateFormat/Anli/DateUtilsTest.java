package Heima.SimpleDateFormat.Anli;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String format = "yyyy年MM月dd日 HH时mm分ss秒";

        //Date--String
        String datetostring = DateUtils.datetostring(d, format);
        System.out.println(datetostring);

        //String--Date
        String ss = "2029-08-22 11:11:11";
        String format2 = "yyyy-MM-dd HH:mm:ss";
        Date stringtodate = DateUtils.stringtodate(ss, format2);
        System.out.println(stringtodate);


    }
}
