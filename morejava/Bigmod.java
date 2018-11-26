import java.util.*;
public class Bigmod {
public static void main(String [] args) {
	Scanner var = new Scanner(System.in);
	
	System.out.println("Enter Big Number");
	String s = var.nextLine();
	System.out.println("Enter number you want to mod with");
	int a = var.nextInt();
	System.out.println(bigmod(s,a));
	
	
}




public static int bigmod(String s , int a) {
	int res=0;
	for(int i=0;i<s.length();i++) {
		res = (res*10+(int)(s.charAt(i)-'0'))%a;
	}
	return res;
	
}

}
