package pkg;

public abstract class HamburgerDecorator extends Hamburger {
	
	protected Hamburger hamburger;

	public HamburgerDecorator(Hamburger hamburger) {
		super(0);
		this.hamburger = hamburger;
	}

}
