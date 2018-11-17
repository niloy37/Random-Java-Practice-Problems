package LabMid;
import java.util.*;

public class Range {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter three numbers x,y,z");
		int x=var.nextInt();
		int y=var.nextInt();
		int z = var.nextInt();
		
		int count =0;
		for(int i=x;i<y;i++) {
			if(i%z==0)
				count++;
		}
		System.out.println(count);
	}

}
