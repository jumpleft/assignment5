package com.meritamerica.assignment5.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public static final double savingsInterestRate = 0.01;
	
	
	
	public SavingsAccount() {
		super();
		this.interestRate = savingsInterestRate;
	}
	
	public SavingsAccount(double startBalance){		
		super(startBalance);
		this.interestRate = savingsInterestRate;
	}
	
	public SavingsAccount(double startBalance , double interestRate , long accountNumber , java.util.Date startDate) {
		
		super(accountNumber , startBalance , startDate);
		this.interestRate = interestRate;
	}
	
	public static SavingsAccount readFromString(String accountData) {
		
		SavingsAccount toBeAdded = null;
		try{
			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
			String[] toBeParsed = accountData.split(",");
			long accountNumberToBeAdd = Integer.parseInt(toBeParsed[0]);
			double curentBalanceToBeAdded = Double.parseDouble(toBeParsed[1]);
			double interestRateToBeAdded = Double.parseDouble(toBeParsed[2]);
			java.util.Date dateToBeAdded = dateFormatter.parse(toBeParsed[3]);
			
			
			toBeAdded = new SavingsAccount(curentBalanceToBeAdded , interestRateToBeAdded , accountNumberToBeAdd , dateToBeAdded);
		
			//NumberFormatException
							
		}catch(NumberFormatException exception) {
			throw exception;
			
		}catch(ParseException exception) { 
			
		}
		
		return toBeAdded;
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public static double getSavingsinterestrate() {
		return savingsInterestRate;
	}
	
		
	
}

