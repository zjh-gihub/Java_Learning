package Heima.Shiping;

public class SameArr {
    public static void main(String[] args) {
        int []a = {11,22,33,44,55};
        int []b = {11,22,33,44,55};
        boolean c = Same(a,b);
        System.out.println(c);
    }
    public static boolean Same(int[]a,int[]b){
        if (a.length!=b.length){
            return false;
        }

        for(int x=0;x<a.length;x++){
            if(a[x]!=b[x]){
                return false;
            }
        }
        return true;
    }
}
