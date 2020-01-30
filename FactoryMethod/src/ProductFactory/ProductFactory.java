package ProductFactory;

public class ProductFactory {
	
	private int serialNumber = 0;
	private String generateSerialNumber() {
		
		return (++serialNumber)+"";
	}
	
	public Product getProduct(String productName) {
		
		if(productName=="one") {
			
			return new ProductOne(generateSerialNumber());
			
		}
		else if(productName=="two") {
			
			return new ProductTwo(generateSerialNumber());
			
		}
		else
			return null;
		
		
		
	}
	

}
