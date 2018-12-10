import javax.swing.*;
import java.util.*;
public class JOptionPaneShowMessage {
public static void main(String[] args) {
	System.out.println("Enter Password : ");
	Scanner var = new Scanner(System.in);
	ImageIcon img = new ImageIcon("C:\\Users\\Havocc\\eclipse-workspace\\Porjectpartpractice\\src\\Icon.png");

	int choice = JOptionPane.showConfirmDialog(null,"Do you want to Log in First !","Confirmation Required",JOptionPane.YES_NO_OPTION);
	System.out.println(choice);
	
	if(choice == JOptionPane.YES_OPTION) {
	String pass = JOptionPane.showInputDialog("Enter your Password","password");
	int password = Integer.parseInt(pass);
	//System.out.println(password);
	
	if(password == 12345) {
		JOptionPane.showMessageDialog(null,"Password is Correct","Password",JOptionPane.INFORMATION_MESSAGE,img);
	}
	else JOptionPane.showMessageDialog(null,"Password is incorrect","Password",JOptionPane.INFORMATION_MESSAGE,img);
	}
	else {
		JOptionPane.showMessageDialog(null, "You need to Log in First","Error",JOptionPane.ERROR_MESSAGE,img);
	}
	
}
}
