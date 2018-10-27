import java.util.*;

public class Mrh1midquestion4 {
public static void main(String[] args) {
	System.out.println("Enter the radius");
	Scanner var = new Scanner(System.in);
	int radius = var.nextInt();
	double area=calculateArea(radius);
	double circumference =calculateCircumference(radius);
	 System.out.println("The area is "+area+" the circumference is ="+circumference);
	
}

public static double calculateArea(int radius) {
	
	return Math.PI*radius*radius;
}

public static double calculateCircumference(int radius) {
	
	return 2*Math.PI*radius;
}
}
