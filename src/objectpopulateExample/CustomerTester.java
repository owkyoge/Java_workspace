package objectpopulateExample;

public class CustomerTester {
	

	public static void main(String[] args) {
		
		// Populate Adress

				Address a = new Address();

				a.setHouseNo(21);
				a.setStreet("Karim Bag");
				a.setVillage("Banaganapalli");
				a.setMandal("Banaganapalli");
				a.setDistic("Kurnool");
				a.setState("Andhra Pradesh");
				a.setPinCode(518124l);
		
		
		
		// Populate Customer
				
				// new customer ( "Eswar" ,15);

					customer c = new customer();

					c.setCustomerId(44);
					c.setCustomerName("KING");
					c.setCustomerCellNo(6300012345l);
					c.setCustomerSex('M');
					c.setaddr(a);

					Address customeraddress = c.getaddr();

					System.out.println("CustomerId : " + c.getCustomerId());
					System.out.println("CustomerName : " + c.getCustomerName());
					System.out.println("CustomerCellNo  : " + c.getCustomerCellNo());
					System.out.println("CustomerSex  : " + c.getCustomerSex());
					System.out.println("CustomerHouseno : " + customeraddress.getHouseNo());
					System.out.println("CustomerStreet : " + customeraddress.getStreet());
					System.out.println("CustomerVillage : " + customeraddress.getVillage());
					System.out.println("CustomerMandal  : " + customeraddress.getMandal());
					System.out.println("CustomerDistic : " + customeraddress.getDistic());
					System.out.println("CustomerState : " + customeraddress.getState());
					System.out.println("CustomerPinCode : " + customeraddress.getPinCode());
		
	}
	
}
