import java.util.*;
public class isPalindromeString {
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner var = new Scanner(System.in);
	String str = var.nextLine();
	
	int length = str.length();
	int start =0; 
	int mid =(start+length)/2;
	int end = length-1;
	int i;
	for(i = start;i<=mid;i++) {
		if(str.charAt(start)==str.charAt(end)) {
			start++;
			end--;
		}
		else break;
	}
	if(i==mid+1) {
		System.out.println("Palindrome");
	}
	else System.out.println("Not Palindrome");
	
}
}
