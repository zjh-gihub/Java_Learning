package Heima.ZiFuChuan;

public class PinJieZiFuChuan {
    public static void main(String[] args) {
        //定义一个int类型的数组，用静态初始化
        int [] arr = {1,2,3};
        String z = ArrToString(arr);
        System.out.println(z);
    }

    //定义一个方法，拼接
    /*
      两个明确：
            返回值类型：String
            参数：int[] arr
     */
    public static String ArrToString(int [] arr){
        //在方法中遍历数组
        String s = "";
        s+= "[";
        for(int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                s+=arr[i];
            }else{
                s+=arr[i];
                s+=",";
            }
        }
        s+="]";
        return s;
    }
}
