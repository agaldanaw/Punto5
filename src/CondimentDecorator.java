
public abstract class CondimentDecorator  implements Beverage{

	private Beverage beverage;
	
	public CondimentDecorator(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	public Beverage getBeverage() {
		return beverage;
	}
	
	public void setBeverage(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription();
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return beverage.cost();
	}

}
