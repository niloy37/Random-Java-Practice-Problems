import java.util.*;
public class PracticeBooleanFlag {
	public static void main(String[] args) {
		System.out.println("Enter a number from 1-2");
		Scanner var = new Scanner(System.in);
		int x=var.nextInt();
		
		Random rand = new Random();
		int y= rand.nextInt(2)+1;
		boolean found = false;
		if(y==x)
			found = true;
		System.out.println(found);
		
	}

}
