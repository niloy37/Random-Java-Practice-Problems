import java.util.*;

import java.lang.*;
public class SelectionSort {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter Array size");
	int size = var.nextInt();
	int [] array = new int [size];
	takeInput(array);
	selectionSort(array);
	//printing the array
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	
	
}

public static void takeInput(int [] array) {
	Scanner var = new Scanner(System.in);
	for(int i=0;i<array.length;i++) {
		array[i]=var.nextInt();
	}
}

public static void selectionSort(int [] array) {
	
	for(int i=0 ;i<array.length-1;i++) {
		int currentMin= array[i];
	     int currentMinIndex = i;
		for(int j=i+1;j<array.length;j++) {
			if(currentMin>array[j]) {
				currentMin=array[j];
				currentMinIndex=j;
			}
			if(currentMinIndex != i) {
				array[currentMinIndex] =array[i];
				array[i]=currentMin;
			}
		}
	}
	
	
}
}
