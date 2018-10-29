import java.util.*;
public class RemoveElementArray {
public static void main(String[] args) {
	System.out.println("Enter the size of the array");
	Scanner var = new Scanner(System.in);
	int x = var.nextInt();
	
	int [] array = new int [x];
         takeInput(array);
         deleteElement(array);
         printArray(array);
	
}
public static void takeInput(int [] array) {
	Scanner var = new Scanner(System.in);
	for(int i = 0;i<array.length;i++) {
		array[i]=var.nextInt();
		
	}
}
public static void deleteElement(int array[]) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the index you want to delete");
	int x = var.nextInt();
	
	for(int i=0;i<array.length;i++) {
		if(array[i]==x) {
			for(int j=i;j<array.length;j++) {
				array[j]=array[j+1];
			}
		}
	}
}
public static void printArray(int array[]) {
	for(int i=0;i<array.length-1;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
}



}
