/**
 * 
 */
import java.util.Scanner;

/**
 * @author Havocc
 *
 */
public class IsPalindromea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner var = new Scanner(System.in);
 System.out.println("Enter the digit you want to check");
 int x=var.nextInt();
 int rem=0;int rev=0;
 int n=x;
 while(x!=0) {
	 rem=x%10;
	 rev=rev*10+rem;
	 x=x/10;
 }
String answer=(n==rev)?"Palindrome":"Not Palindrome";
System.out.println(answer);
 
	}

}
