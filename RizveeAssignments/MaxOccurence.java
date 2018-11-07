package RizveeAssignment;


import java.util.*;
public class MaxOccurence {

	public static void main(String[] args) {
		
     Scanner var = new Scanner(System.in);
     
     System.out.println("Enter the Size of the array");
     int size= var.nextInt();
     
     int [] array = new int [size];
     takeInput(array);
    
    findMax(array);
             
    
    		 
	}
	public static void takeInput(int [] array) {
		Scanner var = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i]=var.nextInt();
		}
	}
	
	public static void findMax(int [] array) {
		int max=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
				
			}
		}
	 maxSearch(array,max);	
	}
	public static void maxSearch(int [] array , int max) {
		int count =0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==max) {
				count++;
			}
			
		}
		System.out.println("Max Value is ="+max+" Occured ="+count);
	}
}