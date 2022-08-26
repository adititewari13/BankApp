package day6;

public class PersonalCustomer extends Customer {
	private String homePhone;
	private String workPhone;
	
	public PersonalCustomer() {
	}
	
	public PersonalCustomer(String firstName, String lastName, 
			String address, double balance, String homePhone, String workPhone) {
		
		super(firstName, lastName, address, balance);
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}


	@Override
	public double calculateIntrest() {
		return (getBalance() * 4.5 / 100);
	}	
}
