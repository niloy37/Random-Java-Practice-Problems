import java.util.*;



class Zero{
public static void main (String [] args) {

Scanner var = new Scanner(System.in);
System.out.println("Enter the size of the array");
int x = var.nextInt();

int [] array = new int [x];

// take input
for(int i=0;i<x;i++){
array[i]=var.nextInt();
}
int temp;


for(int  i=0;i<array.length-1;i++){
for(int j=0;j<(x-1);j++){
  if(array[j]==0){
  temp = array[j];
   array[j]=array[j+1];
   array[j+1]=temp;
}

}
  




}
//print array
for(int i=0;i<x;i++){
System.out.print(array[i]+" ");
}


  }
}