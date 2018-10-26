import java.util.*;
public class TimeConversion {
public static void main(String[] args) {
	System.out.println("Enter Second");
	Scanner var = new Scanner(System.in);
	int x = var.nextInt();
	int hour=0;
	int min=0;
	int second=0;
	
		hour = x/3600;
		x=x%3600;
		min = x/60;
		x=x%60;
		second = x;
		System.out.println(hour+" hours "+min+" mins "+second+" seconds ");
		
		
	
	
}
}
