package Heima.Shiping;

public class SumArr {
    public static void main(String[] args) {
        int [] a = {68,27,95,88,171,996,51,210};
        Sum(a);
    }

    public static void Sum(int[]a){
        int sum = 0;
        for (int x = 0;x<a.length;x++){
            if(a[x]%10!=7 && a[x]/10%10!=7 && a[x]%2==0){
                sum +=a[x];
            }
        }
        System.out.println(sum);
    }
}
