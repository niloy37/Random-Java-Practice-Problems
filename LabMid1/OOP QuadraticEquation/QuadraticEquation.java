package LabMid;
import java.util.*;

public class QuadraticEquation {
	
	private int a;
	private int b;
	private int c;
	
	
	QuadraticEquation(){
		
	}
	QuadraticEquation(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	public void setA(int a) {
		this.a=a;
	}
	public void setB(int b) {
		this.b=b;
	}
	public void setC(int c) {
		this.c=c;
	}
	
	public int getA() {
		return this.a;
	}
	public int getB() {
		return this.b;
	}
	public int getC() {
		return this.c;
	}
	
	public double getDiscriminant() {
		double discriminant = Math.pow(this.b, 2)-4*this.a*this.c;
		
		return discriminant;
	}
	public double getRoot1() {
		if(Math.pow(this.b, 2)-4*this.a*this.c<0) {
			return 0;
		}
		
		else {
			double dis1= Math.pow(this.b, 2)-4*this.a*this.c;
			double r1 =((-this.b-Math.sqrt(dis1))/2*this.a);
			r1= Math.round(r1*100d)/100d;
			return r1;
		}
	}
	public double getRoot2() {
		if(Math.pow(this.b, 2)-4*this.a*this.c<0) {
			return 0;
		}
		
		else {
			double dis2= Math.pow(this.b, 2)-4*this.a*this.c;
			double r2 =((-this.b+Math.sqrt(dis2))/2*this.a);
			r2= Math.round(r2*100d)/100d;
			return r2;
	}
}
	
	
	

}
