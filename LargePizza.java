
public class LargePizza extends Pizza {

	public LargePizza() {
		super("Large");
		cost = 12;
	}
	
	public void addTopping(String Top) {
		toppings.add(Top);
		cost = cost + .75;
	}
}
