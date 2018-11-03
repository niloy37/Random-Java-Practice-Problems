import java.util.*;


class Method{
public static void main(String [] args){

Scanner var = new Scanner(System.in);
System.out.println("Enter the size of the array");

int x = var.nextInt();

int [] array = new int [x];

//take input
for(int i=0;i<x;i++){

array[i]=var.nextInt();

}

boolean found=neg(array); 

System.out.println(found);



}

public static boolean neg(int [] array){

for(int i=0;i<array.length;i++){

if(array[i]<=0)
return false;




}

return true;

}




}