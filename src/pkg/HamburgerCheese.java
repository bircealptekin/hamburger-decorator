package pkg;

public class HamburgerCheese extends HamburgerDecorator{
	private String hamburgerCheese;
	private double cheeseCost=0;
	
	public HamburgerCheese(String hamburgerCheese, Hamburger pizza) {
		super(pizza);
		this.hamburgerCheese = hamburgerCheese;
	}
	
	@Override
	public void setCost() {
		if(hamburgerCheese.equals("Regular Cheddar")) 
			cheeseCost = 2;
		else if(hamburgerCheese.equals("Reduced Fat Cheddar"))
			cheeseCost = 2;
	}
	
	public double getCost() {
		setCost();
		return cheeseCost+hamburger.getCost();
	}
}