import java.util.Scanner;
public class NextLetter {
	public static void main(String[] args) {
		System.out.println("Enter a char");
		Scanner var = new Scanner(System.in);
		int x = var.next().charAt(0);
		x=x+1;
		char y=(char)x;
		System.out.println(y);
	}

}
