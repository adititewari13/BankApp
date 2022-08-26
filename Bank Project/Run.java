package day6;

import java.util.Scanner;


public class Run {
	public static void main(String[] args) {
		Bank bank = new Bank();
		long customerId;

		while (true) {
			System.out.println("1. Create Personal Customer");
			System.out.println("2. Create Commercial Customer");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Display Customer Summary");
			System.out.println("6. Total Value");
			System.out.println("7. Fund Transfer");
			System.out.println("8. Calculate Intrest");
			System.out.println("9. Exit");
			System.out.println();

			Scanner scanner = new Scanner(System.in);
			System.out.print("Which operation would you like to perform : ");
			int option = scanner.nextInt();
			scanner.nextLine();
			System.out.println();


			switch(option) {
			case 1:
				System.out.println("Enter FirstName, LastName, Address, Balance, HomePhone & WorkPhone");				
				customerId = bank.createPersonalCustomer(scanner.nextLine(), scanner.nextLine(),  
						scanner.nextLine(), scanner.nextDouble(), scanner.next(), scanner.next());
				System.out.println("Save Customer Id: " + customerId + ", for future transactions");
				break;
				
			case 2:
				System.out.println("Enter FirstName, LastName, Address, Balance, ContactPersonName & ContactPersonPhone");				
				customerId = bank.createCommercialCustomer(scanner.nextLine(), scanner.nextLine(),  
						scanner.nextLine(), scanner.nextDouble(), scanner.next(), scanner.next());
				System.out.println("Save Customer Id: " + customerId + ", for future transactions");
				break;

			case 3:
				System.out.println("Enter CustomerId & Deposit Amount");
				String depositMessage = bank.deposit(scanner.nextLong(), scanner.nextDouble());
				System.out.println(depositMessage);
				break;

			case 4:
				System.out.println("Enter CustomerId & Withdraw Amount");
				String withdrawMessage = bank.withdraw(scanner.nextLong(), scanner.nextDouble());
				System.out.println(withdrawMessage);
				break;

			case 5:
				System.out.println("Enter Customer Id");
				Customer customer = bank.getCustomerDetails(scanner.nextLong());

				if(null != customer) {
					System.out.println("Customer Id      : " + customer.getCustomerId());
					System.out.println("Customer Name    : " + customer.getFirstName() + "." + customer.getLastName());
					System.out.println("Customer Address : " + customer.getAddress());
					System.out.println("Account Balance  : " + customer.getBalance());
					System.out.println();
				} else {
					System.out.println("No Customer Found");
				}
				break;

			case 6:
				System.out.println("Total Value : " + bank.totalValue());
				break;

			case 7:
				System.out.print("Enter From Customer Id  : ");
				long fromCustomerId = scanner.nextLong();
				System.out.print("Enter To Customer Id    : ");
				long toCustomerId = scanner.nextLong();
				System.out.print("Enter Transfer Amount : ");
				double amount = scanner.nextDouble();
				
				String message = bank.fundTransfer(fromCustomerId, toCustomerId, amount);
				System.out.println(message);
				break;
			
			case 8:
				
				break;
				
			case 9:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Option!!!");
				break;
			}
			System.out.println();
		}
	}
}
