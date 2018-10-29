import java.util.Scanner;
public class ArithmeticOperand {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter arithmetic operator(+ - * /)");
     char operator =var.next().charAt(0);
     
     System.out.println("Enter 1st operator");
     int x=var.nextInt();
     System.out.println("Enter 2nd operator");
     int y=var.nextInt();
     
     
     switch(operator) {
     case '+' : System.out.println("Addition ="+(x+y));break;
     case '-' : System.out.println("Substraction ="+(x-y));break;
     case '*' : System.out.println("Multiplication ="+(x*y));break;
     case '/' : System.out.println("Division ="+((x*1.0)/y));break;
     default  : System.out.println("Wrong Operand");
     }
     
}
}
