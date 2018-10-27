import java.util.*;
public class TemperatureArray {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter temperature of 10 days");
		int [] temperatureArray = new int [10];
		for(int i=0;i<10;i++) {
			temperatureArray[i]=var.nextInt();
		}
		int [] statusArray = new int[10];
		for(int i=0;i<10;i++) {
			
			if(temperatureArray[i]<25) 
				statusArray[i]=0;
			else if (temperatureArray[i]>=25 && temperatureArray[i] < 35)
				statusArray[i]=1;
			else 
				statusArray[i]=2;
			
		}
		//printing statusArray
		System.out.print("The values in Status array");
		for(int i = 0;i<10;i++)
			System.out.print(" "+statusArray[i]);
		System.out.println();
		int status0=0;
		int status1=0;
		int status2=0;
		for(int i=0;i<10;i++) {
         if(statusArray[i]==0)
        	 status0++;
         if(statusArray[i]==1)
        	 status1++;
         if(statusArray[i]==2)
        	 status2++;
         
			
			
		}
		System.out.println("Number of days with status 0: "+status0);
		System.out.println("Number of days with status 1: "+status1);
		System.out.println("Number of days with status 2: "+status2);
		
		
	}

}
