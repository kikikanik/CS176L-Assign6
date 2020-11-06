public class SmallPizza extends Pizza {

	public SmallPizza() {
		super("Small");
		cost = 8;
	}
	
	public void addTopping(String Top) {
		toppings.add(Top);
		cost = cost + .25;
	}
}
