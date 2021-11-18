package pkg;

import java.util.ArrayList;


public class HamburgerExtra extends HamburgerDecorator{
	
	private ArrayList<String> hamurgerExtras; 
	private double extrasCost=0;
	
	public HamburgerExtra(ArrayList<String> hamurgerExtras, Hamburger hamburger) {
		super(hamburger);
		this.hamurgerExtras = hamurgerExtras;
	}
	
	@Override
	public void setCost() {
		int size  = hamurgerExtras.size();
		extrasCost =  0.5 * size; 
		// 0.5 per topping
	}
	
	public double getCost() {
		setCost();
		return extrasCost+hamburger.getCost();
	}
	
	
}
