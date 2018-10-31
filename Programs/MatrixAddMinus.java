import java.util.Scanner;
public class MatrixAddMinus {
public static void main(String [] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the size for the first matrix (row then column)");
	int row1=var.nextInt();
	int column1=var.nextInt();
	System.out.println("Enter the size of the second matrix(row then column");
	int row2=var.nextInt();
	int column2=var.nextInt();
	if(row1==row2&&column1==column2) {
		int [][] matrix1 = new int[row1][column1];
		int [][] matrix2 = new int[row2][column2];
		//take input matrices
		System.out.println("Enter values for matrix 1");
		matrixTakeInput(matrix1);
		System.out.println("Enter values for matrix 2");
		matrixTakeInput(matrix2);
		matrixAddition(matrix1,matrix2);
		matrixSubstraction(matrix1,matrix2);
		
	}
	else System.out.println("Cannot add/substract two matrices");

}
	public static void matrixTakeInput(int [][] matrix) {
		Scanner var = new Scanner(System.in);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=var.nextInt();
			}
		}
	}
	
	public static void matrixAddition(int [][]matrix1,int[][]matrix2) {
	int[][] newMatrix=new int[matrix1.length][matrix1[0].length];
	for(int i=0;i<matrix1.length;i++) {
		for(int j=0;j<matrix1[i].length;j++) {
			newMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
		}
	}
	System.out.println("Matrices after addition");
	printMatrix(newMatrix);

	
	}
	public static void matrixSubstraction(int [][]matrix1,int[][]matrix2) {
		int[][] newMatrix2=new int[matrix1.length][matrix1[0].length];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				newMatrix2[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		System.out.println("Matrices after substraction");
		printMatrix(newMatrix2);
	}
	public static void printMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
			}
		
		
	}
	

