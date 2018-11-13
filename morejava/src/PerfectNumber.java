import java.util.*;

class PerfectNumber{
public static void main(String[] args){
     
    System.out.println("Enter number");
    Scanner var = new Scanner(System.in);
    int number=var.nextInt();

    for (int i = 1;i <= number; i++) { 
        int sum = 0;
        for (int j = 1; j < i; j++) {
            if ((i % j) == 0) {
                sum += j;
            } 
        }  
        if (sum == i){           
            System.out.println(sum);
        }          
    }      
} 
}