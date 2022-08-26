package day6;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		Customer customer1 = new Customer("Pasha", "MD", "Hyderabad", 9999.99);
		System.out.println(customer1);
		
		Customer customer2 = new Customer("Sree", "Harsha", "Secunderabad", 9898.98);
		System.out.println(customer2);
		
		Customer customer3 = new Customer();
		
		customer3.setFirstName("venkat");
		customer3.setLastName("M");
		customer3.setAddress("Delhi");
		System.out.println(customer3);	
		
		/*
		customer2.setLastName("H");
		System.out.println(customer2);	
		
		System.out.println(customer2.getCustomerId());
		System.out.println(customer2.getFirstName() + " " + customer2.getLastName());
		System.out.println(customer2.getAddress());
		System.out.println(customer2.getBalance());
		*/
	}
}
