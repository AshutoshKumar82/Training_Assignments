package com.example.demo;

public interface BankAccountRepository {
	
	public  double getbalance(int accountid);
	
	public  double updatebalance(int accountid, double newBalance);
	
}
