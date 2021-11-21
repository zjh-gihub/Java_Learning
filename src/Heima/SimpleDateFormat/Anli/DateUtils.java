package Heima.SimpleDateFormat.Anli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //对象私有制
    private DateUtils(){}

    /*
    把日期转为指定格式的字符串
    返回值类型：String
    参数：Date date, String format
    */
    public static String  datetostring(Date d, String format){
        SimpleDateFormat sdf =new SimpleDateFormat(format);
        String d1 = sdf.format(d);
        return d1;
    }
    /*
    把字符串解析为指定格式的日期
    返回值类型：Date
    参数：String s, String format
    */
    public static Date stringtodate(String s,String format) throws ParseException {
        SimpleDateFormat dd = new SimpleDateFormat(format);
        Date p = dd.parse(s);
        return p;
    }
}
