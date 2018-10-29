import java.util.*;
public class EnhancedLoop {
public static void main(String[] args) {
	System.out.println("Enter Size of the array");
	Scanner var = new Scanner(System.in);
	int x = var.nextInt();
	int [] array = new int[x];
	for(int i=0;i<array.length;i++) {
		array[i]=var.nextInt();
	}
	for(int n:array) {
		
		System.out.print(n+" ");
	}

	
	
	
}
}
