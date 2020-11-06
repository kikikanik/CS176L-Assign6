
public class MediumPizza extends Pizza 
{
	public MediumPizza() {
			super("Medium");
			cost = 10;
	}
	
	public void addTopping(String Top) {
		toppings.add(Top);
		cost = cost + .50;
	}
}
