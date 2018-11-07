package RizveeAssignment;
import java.util.*;


public class tuitionfee {
public static void main(String[] args) {
   double tuitionfee = 2200;
   double rate = (2.5/100);
   
   double totalfee=0;
   
   for(int i=1;i<=12;i++) {
	   totalfee+=tuitionfee;
	    tuitionfee=tuitionfee+(tuitionfee*= rate);
   }
   totalfee = Math.round(totalfee*100d)/100d;
   System.out.println("The total fee after 12 semester is "+totalfee);
}
}

