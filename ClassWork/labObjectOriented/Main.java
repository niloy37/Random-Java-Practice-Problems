package ObjectOrientedAccount;
import java.util.Scanner;
public class Main {
public static void main(String [] args) {
	// TODO Auto-generated constructor stub
	System.out.println("Enter the radius of circle 1");
	Scanner var = new Scanner(System.in);
	int x =var.nextInt();
	System.out.println("Enter The radius of Circle 2");
	int y =var.nextInt();
	
  Circle circle = new Circle(x);
  Circle circle2 = new Circle();
  
  circle2.setRadius(y);
  System.out.println("Circle 1");
  circle.area();
  circle.circumference();
  System.out.println("Circle 2");
  circle2.area();
  circle2.circumference();
  
  
  
  
  
  
  

}
}
