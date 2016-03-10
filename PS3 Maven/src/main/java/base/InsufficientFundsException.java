package base;

import java.io.*;

public class InsufficientFundsException extends Exception {
	
	private double amountReq;

	public InsufficientFundsException(double amountNeeded) {

		this.amountReq = Math.abs(amountReq);
		
		System.out.println("Insufficient funds. Withdrawl cannot be made");
		System.out.println(""+amountReq+"$ more is the amount required");
	}

	public double getAmountReq() {
		return amountReq;
	}

}