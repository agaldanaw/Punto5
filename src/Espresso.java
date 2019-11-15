
public class Espresso implements Beverage 
{
	public String description;
	public Double cost;
	
	public Espresso(String d, Double c )
	{
		description = d;
		cost = c;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return cost;
	}

}

