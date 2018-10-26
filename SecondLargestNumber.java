import java.util.Scanner;
public class SecondLargestNumber {
public static void main(String[] args) {
	System.out.println("Enter 3 numbers");
	Scanner var = new Scanner(System.in);
	int x = var.nextInt();
	int y = var.nextInt();
	int z= var.nextInt();
	
	if((x>y&&x<z)||(x<y&&x>z)) System.out.println(x+" is second Largest");
	if((y>x&&y<z)||(y<x&&y>z)) System.out.println(y+" is second Largest");
	if((z>x&&z<y)||(z<x&&z>y)) System.out.println(z+" is second Largest");
	
}
}
