import java.util.*;
import java.io.*;
import java.lang.*;

class arrayNew {
public static void main (String [] args){

int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
Scanner var = new Scanner(System.in);
System.out.println("Enter the key");
int number = var.nextInt();
addWise(a,number);

}
public static void addWise(int [][] a , int number){
 int sum = 0;
for(int i=0;i<3;i++)

sum = sum+a[i][number];





System.out.println(sum);


}





}