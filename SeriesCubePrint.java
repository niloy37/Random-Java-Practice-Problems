import java.util.*;
public class SeriesCubePrint {
public static void main(String[] args) {
	System.out.println("Enter N");
	Scanner var = new Scanner(System.in);
	int n= var.nextInt();
   System.out.println(printSum(n));	
}
public static double printSum (int n) {
	
	double sum = 0;
	for(int i=0;i<=n;i++) {
		
		sum=sum+ Math.pow(i,3);
	}
	return sum;
}
}
