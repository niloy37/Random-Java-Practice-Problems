import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner var = new Scanner(System.in);
        int num = var.nextInt();
        System.out.println(dec2hex(num));
    }
    public static String dec2hex( int num){
        int rem;


        String str2="";


        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num>0)
        {
            rem=num%16;
            str2=hex[rem]+str2;
            num=num/16;
        }
      return str2;
    }
}
