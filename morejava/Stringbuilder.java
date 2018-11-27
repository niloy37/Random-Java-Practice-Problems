package morejava;
import java.util.*;
public class Stringbuilder {
public static void main(String[] args) {
	System.out.println("Enter 3 Strings ");
	Scanner var = new Scanner(System.in);
	
	String s = var.nextLine();
	String t = var.nextLine();
	String u = var.nextLine();
	
	
	
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	sb.append(t);
	sb.append(u);
	System.out.println(sb.toString());
	
}
}
