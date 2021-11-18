package pkg;

public class HamburgerSauce extends HamburgerDecorator{
	
	private String hamburgerSauce;
	private double sauceCost=0;
	
	public HamburgerSauce(String hamburgerSauce, Hamburger hamburger) {
		super(hamburger);
		this.hamburgerSauce = hamburgerSauce;
	}
	
	@Override
	public void setCost() {
		if(hamburgerSauce.equals("Ketchup")) 
			sauceCost = 1;
		else if(hamburgerSauce.equals("Mayonnaise"))
			sauceCost = 1;
		else if(hamburgerSauce.equals("BBQ Sauce"))
			sauceCost = 2;
	}
	
	public double getCost() {
		setCost();
		return sauceCost+hamburger.getCost();
	}
}
