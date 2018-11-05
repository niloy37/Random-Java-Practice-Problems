import java.util.*;


class ZeroBreak{
	
	
	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		
		int [] array = new int[100];
		
		int index=-1;
		for(int i=0;i<100;i++) {
			array[i]=var.nextInt();
			if(array[i]==0) {
				index=i;
				break;
			}
		}
		
		//printing array
		
		for(int i=0;i<index;i++) {
			System.out.print(array[i]+" ");
		}
		
		
		
	}
}