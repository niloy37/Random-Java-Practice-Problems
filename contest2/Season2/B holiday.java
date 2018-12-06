import java.util.*;
public class HolidayofEquality {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	int x =var.nextInt();
	int [] array = new int [x];
	
	for(int i=0;i<x;i++) {
		array[i]=var.nextInt();
	}
	Arrays.sort(array);
	int rem=0;
	int sum=0;
	for(int i=0;i<x-1;i++) {
		rem=array[x-1]-array[i];
		sum+=rem;
	}
	System.out.println(sum);
	
}
}
