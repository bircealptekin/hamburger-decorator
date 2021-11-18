package pkg;

public class HamburgerBun extends HamburgerDecorator {
	
	private String hamburgerBun;
	private double bunCost=0;
	
	public HamburgerBun(String hamburgerBun, Hamburger hamburger) {
		super(hamburger);
		this.hamburgerBun = hamburgerBun;
	}
	
	public String getBun() {
		return hamburgerBun;
	}
		
	@Override
	public void setCost() {
		if(hamburgerBun.equals("Classic Buns")) 
			bunCost = 1;
		else if(hamburgerBun.equals("Sesame Seed Buns"))
			bunCost = 2;
		else if(hamburgerBun.equals("Ciabatta"))
			bunCost = 3;

	}
	
	public double getCost() {
		setCost();
		return bunCost+hamburger.getCost();
	}
	
}
