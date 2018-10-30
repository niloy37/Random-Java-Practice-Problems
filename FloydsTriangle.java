import java.util.Scanner;
public class FloydsTriangle {
public static void main(String[] args) {
	System.out.println("Enter value");
	Scanner var = new Scanner(System.in);
	int x=var.nextInt();
	
	for(int i=2;i<x+2;i++) {
		for(int j=2;j<=i;j++) {
			if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0)) {
				System.out.print("1 ");
			}
			else System.out.print("0 ");
		}
		System.out.println();
	}
}
}
