import java.util.Scanner;

class Harshad{
public static void main (String [] args) {
 Scanner var = new Scanner(System.in);


System.out.println("Enter the number");

int x = var.nextInt();
 int n=x;
int i=0;
int rem=0;
int sum=0;
 while(x>0){
   rem=x%10;
   sum+=rem;
   x=x/10;


}
 if(n%sum==0)
 System.out.println("Harshad Number");
else 
System.out.println("Not Harshad Number");





}

}