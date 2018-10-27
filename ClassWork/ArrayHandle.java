import java.util.*;

class ArrayHandle{
public static void main (String [] args){
Scanner var = new Scanner(System.in);
System.out.println("Enter the size of the array");
int n = var.nextInt();
 int [] array = new int[n];

for(int i =0;i<n;i++) {

  array[i]=var.nextInt();


}
 boolean found = findingZeros(array,n);
System.out.println(found);

}


public static boolean findingZeros(int [] array,int n){


for(int i=0;i<n;i++){

if(array[i]<=0)
return true;

}
return false;


}

}