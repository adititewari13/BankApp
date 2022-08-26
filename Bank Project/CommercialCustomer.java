package day6;

public class CommercialCustomer extends Customer {
	private String contactPersonName;
	private String contactPersonPhone;
	
	public CommercialCustomer() {
		super();
	}
	
	public CommercialCustomer(String firstName, String lastName, String address, 
			double balance, String contactPersonName, String contactPersonPhone) {
		
		super(firstName, lastName, address, balance);
		this.contactPersonName = contactPersonName;
		this.contactPersonPhone = contactPersonPhone;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonPhone() {
		return contactPersonPhone;
	}
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}

	@Override
	public double calculateIntrest() {
		return (getBalance() * 2.5 / 100);
	}
}