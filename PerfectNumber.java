import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter number");
		int x = var.nextInt();
		int sum=0;
		for(int i=1;i<x;i++) {
			if(x%i==0) {
				sum=sum+i;
			}
			}
		if(sum==x) {
			System.out.println("Perfect Number !");
		}
		else System.out.println("Not perfect !");
			  
		}
	}


