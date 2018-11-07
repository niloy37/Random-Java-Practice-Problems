package RizveeAssignment;
import java.util.*;


public class MatrixMultiplication{
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the size for the first matrix (row then column)");
	int row1=var.nextInt();
	int column1=var.nextInt();
	System.out.println("Enter the size of the second matrix(row then column");
	int row2=var.nextInt();
	int column2=var.nextInt();
	if(column1==row2) {
		int [][] matrix1 = new int[row1][column1];
		int [][] matrix2 = new int[row2][column2];
		//take input matrices
		System.out.println("Enter values for matrix 1");
		matrixTakeInput(matrix1);
		System.out.println("Enter values for matrix 2");
		matrixTakeInput(matrix2);
		matrixMultiplication(matrix1,matrix2);
		
	}
	else System.out.println("Matrix Multiplication not possible");
	
}


public static void matrixTakeInput(int [][] matrix) {
	Scanner var = new Scanner(System.in);
	for(int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[i].length;j++) {
			matrix[i][j]=var.nextInt();
		}
		
			
	}
	
}
public static void matrixMultiplication(int [][]matrix1,int [][]matrix2) {
	int [][]multiMatrix= new int [matrix1.length][matrix2[0].length];
	
		
	for(int i=0;i<matrix1.length;i++) {
		for(int j=0;j<matrix2[0].length;j++) {
			int sum=0;
			for(int k=0;k<matrix2.length;k++) {
				sum+=matrix1[i][k]*matrix2[k][j];
			}
			System.out.print(sum+" ");
			
		}
		System.out.println();
	}
}

}
