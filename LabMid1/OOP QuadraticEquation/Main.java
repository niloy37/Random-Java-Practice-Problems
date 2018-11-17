package LabMid;

public class Main {
public static void main(String[] args) {
	QuadraticEquation e1= new QuadraticEquation(1,5,6);
	
	System.out.println(e1.getDiscriminant());
	System.out.println(e1.getRoot1());
	System.out.println(e1.getRoot2());
}
}
