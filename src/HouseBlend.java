
public class HouseBlend implements Beverage 
{
	public String description;
	public Double cost;
	
	public HouseBlend(String d, Double c )
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

