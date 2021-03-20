package oops.Practice.CompositionExample;

public class MainClss {

	public static void main(String[] args) {
		
		Dimensions dimension = new Dimensions(10,10,5);
		
		Case theCase = new Case("5th Gen","Intelli","240",dimension);
		
		Monitor monitor = new Monitor("27 inch","Benq",27, new Resolution(1240,1047));
        
		Motherboard motherboard = new Motherboard("2020","Intel",4,2,"v2.44");
		
		PC thePC = new PC(theCase, monitor, motherboard);
		
		thePC.powerUP();
	}

}
