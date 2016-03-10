package base;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualIntrestRate = 0;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0;
		annualIntrestRate = 0;
		dateCreated = new Date();

	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualIntrestRate = 0;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualIntrestRate / 12;
	}

	public void withdraw(double amount) throws InsufficientFundsException{
		if (getBalance()-amount>0){
			setBalance(getBalance()-amount);	
		}
		else{
			double amountNeeded = getBalance()-amount;
			throw new InsufficientFundsException(amountNeeded);
		}
	}
	public void deposit(double amount) {
		balance += amount;
	}

}