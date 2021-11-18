package pkg;

public class HamburgerSize extends HamburgerDecorator{

	private String hamburgerSize;
	private double sizeCost;
	
	public HamburgerSize(String hamburgerSize, Hamburger hamburger) {
		super(hamburger);
		this.hamburgerSize = hamburgerSize;
	}
	@Override
	public void setCost() {
		if(hamburgerSize.equals("Kid Size"))
			sizeCost = 1;
		else if(hamburgerSize.equals("Small"))
			sizeCost = 2;
		else if(hamburgerSize.equals("Medium"))
			sizeCost = 3;
		else if(hamburgerSize.equals("Large"))
			sizeCost = 4;
	}

	public double getCost() {
		setCost();
		return sizeCost+hamburger.getCost();
	}
	

}
