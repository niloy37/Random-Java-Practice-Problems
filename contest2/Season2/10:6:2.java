import java.text.DecimalFormat;
import java.util.*;
class Main {
public static void main(String[] args) {
	
	Scanner var = new Scanner(System.in);
	
	int x=var.nextInt();
	
	for(int i=0;i<x;i++) {
		double y;
		y=var.nextDouble();
		 double width =y*0.6;
		 double r = y/5;
		 double circlearea = Math.acos(-1)*r*r;
		 double arealength = y*width-(circlearea);
		
		
		
		System.out.printf("%.2f ", circlearea);
		System.out.printf("%.2f\n",arealength);
		
	}
	
}
}
