package LabMid;
import java.util.*;

public class ReverseTriangle {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter n");
		int n = var.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("@");
			}
			System.out.println();
			
		}
		
		
	}

}
