package ObjectOrientedAccount;
import java.util.*;

public class Circle {
   private int radius;
   Circle(int radius) {
	   this.radius = radius;
	   
   }
   
   Circle(){
	   this.radius=0;
   }
   
   int getRadius() {
	   return radius;
   }
   void setRadius(int radius) {
	   this.radius =radius;
   }
   void area() {
	   double area= Math.PI*radius*radius;
	   area=Math.round(area*100d)/100d;
	   System.out.println("area "+area);
	   
   }
   void circumference() {
	   double circumference = 2*Math.PI*radius;
	   circumference = Math.round(circumference*100d)/100d;
	   System.out.println("Circum "+circumference);
   }
   
   
   
}
