import java.util.Scanner;
public class SumFind {
	
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Press 1 for sum of 1-10 or Press 2 for sum of 20-30 or Press 3 for sum of 35-45");
		int input = var.nextInt();
		
		switch(input) {
		case 1 : SumFind1();break;
		case 2 : SumFind2();break;
		case 3 : SumFind3();break;
		default : System.out.println("Wrong Input !");
		
		}
		
	}
	
	public static void SumFind1() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
			
				
				
			
	}
	public static void SumFind2() {
		int sum=0;
		for(int i=20;i<=30;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
			
				
				
			
	}
	public static void SumFind3() {
		int sum=0;
		for(int i=35;i<=45;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
			
				
				
			
	}

}
