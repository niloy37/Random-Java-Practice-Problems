import java.util.*;
import javax.swing.*;
public class Joption {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Good Morning, Enter a number","Input",JOptionPane.INFORMATION_MESSAGE);
		String str1 = JOptionPane.showInputDialog(null,"Enter First number","Input 1",JOptionPane.QUESTION_MESSAGE);
		String str2 = JOptionPane.showInputDialog(null,"Enter Second Number","Input 2",JOptionPane.QUESTION_MESSAGE);
		
		int x =Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		
		arithmeticFunctions(x,y);
	}
	
	public static void arithmeticFunctions(int x,int y) {
		
		System.out.println("Addition=" +(x+y));
		System.out.println("Multiplication="+(x*y));
		System.out.println("Division="+((x*1.0)/y));
		System.out.println("Substraction="+(x-y));
		
	}

}
