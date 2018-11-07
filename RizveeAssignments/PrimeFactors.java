package RizveeAssignment;
import java.util.Scanner;

public class PrimeFactors {
public static void main(String[] args) {
	System.out.println("Enter an Integer");
	Scanner var = new Scanner(System.in);
	
	int x = var.nextInt();
	
	for(int i=2;i<=x;i++) {
		int count =0;
		while (x % i == 0) {
		    x /= i;
		    count++;
		}
		if (count == 0) {
		    continue;
		}
		System.out.print(i+" ");
		
				}
			}
		}
		
	


