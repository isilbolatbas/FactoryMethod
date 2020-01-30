package Factory;

public class SekilFactory  {
	
	public Sekil getSekil(Sekiltur sekilturu) {
		
		switch(sekilturu) {
		
		case cember:
			return new Cember();
			
		case kare:
			return new Kare();
			
		case dikdortgen:
			return new Dikdortgen();
	
		default:
			return null;
		 
		}
		
		
	}
	

	

}
