import java.util.*;
public class FindingMinorMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner var = new Scanner(System.in);
     
     System.out.println("Enter the Size of the array");
     int size= var.nextInt();
     
     int [] array = new int [size];
     takeInput(array);
     System.out.println("Find Min or Max for the array (1/2)");
     int Case =var.nextInt();
     switch(Case) {
     case 1 : findMin(array);break;
     case 2 : findMax(array);break;
     default:System.out.println("Wrong input");
     }
    		 
	}
	public static void takeInput(int [] array) {
		Scanner var = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i]=var.nextInt();
		}
	}
	public static void findMin(int [] array) {
		int min=array[0];
		int minIndex=0;
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
				minIndex=i;
			}
		}
		System.out.println("Min found! Min value ="+min+" Min index="+minIndex);
	}
	public static void findMax(int [] array) {
		int max=array[0];
		int maxIndex=0;
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
				maxIndex=i;
			}
		}
		System.out.println("Max found! Max value = "+max+" Max index= "+maxIndex);
	}
}
