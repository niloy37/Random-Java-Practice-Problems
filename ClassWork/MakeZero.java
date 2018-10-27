import java.util.*;

class MakeZero{
public static void main (String [] args) {
Scanner var = new Scanner(System.in);


System.out.println("Enter the size of the array");
int x = var.nextInt();
 int [] array = new int[x];

  for(int i=0;i<x;i++){
array[i]=var.nextInt();
}

System.out.println("Enter the index you want to make zero");
int y= var.nextInt();
makeElementZero(array,y);
for(int i=0;i<x;i++){
System.out.print(array[i]+" ");
}


}
public static int[] makeElementZero(int[] array , int y){
array[y]=0;

return array;
}



}