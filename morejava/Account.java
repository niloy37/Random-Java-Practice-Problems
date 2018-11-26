/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
import java.util.*;

 class Main {
public static void main(String[] args) {
	Account [] p = new Account [10];
	
	Date date = new Date(12,9,2011);
	Date date2 = new Date(11,9,2012);
	
	
	for(int i=0;i<10;i++) {
		if(i%2==0) {
			p[i]= new SavingsAccount(i+10,5000.5,3.5,date,"SavingsAccount");
		}
		else p[i]= new CheckingAccount(i+10,5033.78,4.5,date2,"CheckingAccount");
		
		
		System.out.println(p[i].toString());
	}
	
	

	
	
}
}
//import Account.Date;

 class CheckingAccount extends Account {
	private String s;
	
CheckingAccount(){
		
	}
	CheckingAccount(int id,double balance,double annualInterestRate,Date dateCreated,String s){
		super(id,balance,annualInterestRate,dateCreated);
		this.s=s;
	}
	
	public String toString() {
		return super.toString()+" "+this.s+" can be OverDrawn";
	}

}
 class SavingsAccount extends Account {
	
	private String s;
	
	SavingsAccount(){
		
	}
	SavingsAccount(int id,double balance,double annualInterestRate,Date dateCreated,String s){
		super(id,balance,annualInterestRate,dateCreated);
		this.s=s;
	}
	
	public String toString() {
		return super.toString()+" Savings Account Cannot be OverDrawn";
	}

}
 class Date {
	
	private int date;
	private int year;
	private int month;
	Date() {
		
	}
	
 Date(int date,int month,int year){
		this.date=date;
		this.year=year;
		this.month=month;
	}
	
	public String toString() {
		return this.date+" "+this.month+" "+this.year;
	}

}
 class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	
	
	
	Account(){
		
	}
	Account(int id,double balance,double annualInterestRate,Date dateCreated) {
		
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
		this.dateCreated=dateCreated;
		
	}
	
	
	public int getId(){
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public void setDate(Date dateCreated) {
		this.dateCreated=dateCreated;
	}
	
	
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate/100)/12;
	}
	public double getMontlyInterest() {
		double month = (this.annualInterestRate/100)/12;
		return this.balance*month;
		
		
	}
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public String toString() {
		return "ID- "+this.id+" Balance-"+this.balance+" Annual Interest 
Rate"+this.annualInterestRate+" Date Created-"+this.dateCreated.toString();
	}
	

}
