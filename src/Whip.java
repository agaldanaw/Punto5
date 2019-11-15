
public class Whip extends CondimentDecorator {

	Double costo;
	String description;
	
	public Whip(Beverage beverage, Double c, String d) {
		super(beverage);
		// TODO Auto-generated constructor stub
		costo = c;
		description = d;
	}
	
	public String getDescription()
	{
		return getBeverage().getDescription() + "+ " + description;
	}
	
	public Double cost()
	{
		return getBeverage().cost() + costo;
	}

}
