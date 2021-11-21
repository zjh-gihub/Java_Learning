package Heima.Shiping;
/*
目标：遍历数组，输出格式为[11,22,33,44,55]
 */
public class PrintArr {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55};
        printarray(arr);
    }

    public static void printarray(int [] arr){
        System.out.print("[");
        for(int i =0;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
}
