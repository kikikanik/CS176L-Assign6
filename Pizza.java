import java.util.Date;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Pizza
{
	private String size;
	private Date time_ordered;
	protected double cost;
	protected ArrayList<String> toppings = new ArrayList<String>(); 

	public Pizza(String size)
	{
		this.size = size;
		time_ordered = new java.util.Date();
	}

	public String toString()
	{
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

		StringBuilder stringBuilder = new StringBuilder(System.lineSeparator());		
		stringBuilder.append(time_ordered + System.lineSeparator());
		stringBuilder.append(size + " Pizza" + System.lineSeparator());
		if(!toppings.isEmpty())
		{
			stringBuilder.append("Toppings: " + toppings + System.lineSeparator());
		}		
		stringBuilder.append("Total: " +  currencyFormatter.format(cost) + System.lineSeparator());
		return stringBuilder.toString();
	}

}