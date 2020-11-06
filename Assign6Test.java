
public class Assign6Test 
{
	public static void main(String[] args) 
	{		
		SmallPizza sPizza = new SmallPizza();
		sPizza.addTopping("Watermelon");
		sPizza.addTopping("Bacon");
		sPizza.addTopping("Corn");
		System.out.println(sPizza);

		MediumPizza mPizza = new MediumPizza();
		mPizza.addTopping("Peppers");
		mPizza.addTopping("French Fries");
		System.out.println(mPizza);

		LargePizza lPizza = new LargePizza ();
		lPizza.addTopping("Mushrooms");
		System.out.println(lPizza);
	}
}