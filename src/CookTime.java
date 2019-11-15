
public class CookTime extends CondimentDecorator {
	String description;
	
	public CookTime(Beverage beverage, String d) {
		super(beverage);
		// TODO Auto-generated constructor stub
		description = d;
	}
	
	public String getDescription()
	{
		return getBeverage().getDescription() + " + " + description;
	}
	
	public Double cost()
	{
		return getBeverage().cost();
	}
	

}
