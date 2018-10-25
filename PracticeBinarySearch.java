import java.util.*;

public class PracticeBinarySearch {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the array!");
	int [] array = new int [10];
	for(int i=0;i<10;i++) {
		array [i] = var.nextInt();
		
		
	}
	System.out.println("Enter the number you want to search for !");
	int key = var.nextInt();
	Arrays.sort(array);
	boolean flag = binarySearch(array,key);
	System.out.println(flag);
  }
public static boolean binarySearch(int [] array , int key) {
;
int high=9;
int low = 0;

while (low<=high) {
	int mid = (low+high)/2;
	if(array[mid]<key)
		low=mid+1;
	if(array[mid]>key)
		high = mid-1;
	if(array[mid]==key) {
		
		return true;
	}
}
return false;
}
}
