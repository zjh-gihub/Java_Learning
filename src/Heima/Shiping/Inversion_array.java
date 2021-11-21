package Heima.Shiping;

public class Inversion_array {
    public static void main(String[] args) {
        int []a = {19,28,37,46,50};
        Inversion(a);

    }

    public static void Inversion(int []a){
        for (int start = 0,end=a.length-1;start<=end;start++,end--){
            //变量交换
            int temp = a[start];
            a[start] =a[end];
            a[end] =temp;
        }

        System.out.print("[");
        for(int i =0;i<a.length;i++){
            if (i==a.length-1){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i]+",");
            }
        }
        System.out.print("]");
    }
}
