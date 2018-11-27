package morejava;

public class ExceptionHandling {
	public static void main(String args[]){  
		System.out.println("Starting code....");   
		try{  
		      //maybe error 
		      int data=100/0;  
		   }catch(ArithmeticException e){System.out.println(e);}  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
		}  