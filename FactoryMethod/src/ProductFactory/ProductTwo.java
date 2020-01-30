package ProductFactory;

import java.util.Date;

public class ProductTwo implements Product {
	
	
	
	private String serialNumber;
	private Date productDate;
	
	public ProductTwo(String serialNum) {
		
		this.serialNumber=serialNum;
		this.productDate = new Date();
	}
	

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return "silgi";
	}

	@Override
	public String getProductSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}

	@Override
	public Date getProductDate() {
		// TODO Auto-generated method stub
		return productDate;
	}

	
	
}
