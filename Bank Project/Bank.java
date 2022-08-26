package day6;

public class Bank {	
	Customer customerArray[] = new Customer[30];	
	int count = 0;
	
	/*
	public long createCustomer(String firstName, String lastName, String address, double balance) 
	{			
		Customer customer = new Customer(firstName, lastName, address, balance);		
		customerArray[count] = customer;
		count++;		
		return customer.getCustomerId();
	}
	*/
		
	public long createCommercialCustomer(String firstName, String lastName, String address, 
			double balance, String contactPersonName, String contactPersonPhone) {			
		CommercialCustomer commercialcustomer = new CommercialCustomer
			(firstName, lastName, address, balance, contactPersonName, contactPersonPhone);		
		customerArray[count] = commercialcustomer;
		count++;		
		return commercialcustomer.getCustomerId();
	}
	
	public long createPersonalCustomer(String firstName, String lastName, 
			String address, double balance, String homePhone, String workPhone) {		
		PersonalCustomer personalCustomer = new PersonalCustomer
				(firstName, lastName, address, balance, homePhone, workPhone);			
		customerArray[count] = personalCustomer;
		count++;		
		return personalCustomer.getCustomerId();
	}

	
	public String deposit(long customerId, double amount) {		
		for (int i = 0; i < count; i++) {
			if(customerArray[i].getCustomerId() == customerId) {
				customerArray[i].setBalance(customerArray[i].getBalance() + amount);				
				return "Amount Successfully Deposited : " + customerArray[i].getBalance();
			} 
		}				
		return "Customer Not Found!!!";		
	}
	
	public String withdraw(long customerId, double amount) {
		for (int i = 0; i < count; i++) {
			if(customerArray[i].getCustomerId() == customerId) {				
				if(customerArray[i].getBalance() >= amount)	{
					customerArray[i].setBalance(customerArray[i].getBalance() - amount);
					return "Amount Successfully Withdraw : " + customerArray[i].getBalance();
				} else {
					return "Insufficient Balance";
				}				
			} 
		}				
		return "Customer Not Found";
	}

	public Customer getCustomerDetails(long customerId) {
		for (int i = 0; i < count; i++) {
			if(customerArray[i].getCustomerId() == customerId) {
				return customerArray[i];
			}
		}		
		return null;
	}
		
	public double totalValue() {
		double totalValue = 0;
		for(int i = 0; i < count; i++) {
			totalValue += customerArray[i].getBalance();
		}		
		return totalValue;
	}

	private Customer getCustomer(long customerId) {
		for (int i = 0; i < count; i++) {
			if (customerArray[i].getCustomerId() == customerId) {
				return customerArray[i];
			} 
		}
		return null;
	}

public String fundTransfer(long fromCustomerId, long toCustomerId, double amount) {
		
		if(fromCustomerId == toCustomerId) {
			return "To and From CustomerID Cannot be Same.";
		}
		
		Customer fromCustomer = getCustomer(fromCustomerId);
		Customer toCustomer = getCustomer(toCustomerId);
		
		if (null != fromCustomer) {
			if (null != toCustomer) {
				if (fromCustomer.getBalance() - amount > 1000) {
					fromCustomer.setBalance(fromCustomer.getBalance() - amount);
					toCustomer.setBalance(toCustomer.getBalance() + amount);
					return "Funds Transfered Successfully!!";
				} else {
					return "Insufficient Funds";
				}
			} else {
				return "ToCustomer Not Found!!";
			}
		} else {
			return "FromCustomer Not Found!!";
		}
	}
}

