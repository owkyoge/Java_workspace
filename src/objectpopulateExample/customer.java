package objectpopulateExample;

public class customer {

	public customer() {

	}

	private int customerId;
	private String customerName;
	private long customerCellNo;
	private char customerSex;
	private Address addr;

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerCellNo(long customerCellNo) {
		this.customerCellNo = customerCellNo;
	}

	public long getCustomerCellNo() {
		return customerCellNo;
	}

	public void setCustomerSex(char customerSex) {
		this.customerSex = customerSex;
	}

	public char getCustomerSex() {
		return customerSex;
	}

	public void setaddr(Address addr) {
		this.addr = addr;
	}

	public Address getaddr() {
		return addr;
	}
}
