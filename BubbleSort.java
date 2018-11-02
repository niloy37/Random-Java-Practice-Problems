import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
	System.out.println("Enter the size of the array");
	Scanner var = new Scanner(System.in);
	int x = var.nextInt();
	int [] array = new int [x];
	
	//taking array input
	for(int i=0;i<x;i++) {
		array[i]=var.nextInt();
	}
	//bubblesort
	
	bubbleSort(array);
	
	//print array 
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
}
  public static void bubbleSort(int [] array) {
	  
	  int n=array.length;
	  
	  
	  for(int i=0;i<n;i++) {
		  for(int j=1;j<(n-i);j++) {
			  if(array[j-1]>array[j]) {
				  elementSwap(array,j-1,j);
			  }
		  }
	  }
	  
	  
  }
  public static void elementSwap(int [] array , int x,int y) {
	  int temp;
	  temp=array[x];
	  array[x]=array[y];
	  array[y]=temp;
	  
	  
  }
}
