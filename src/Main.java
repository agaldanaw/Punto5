
public class Main {

	public static void main(String[] args)
	{
			/*
			 * Simple: just coffee.
			 * Elementary: with milk.
			 * Sophisticated: with milk and cook time > 2 minutes.
			 * Basic: without milk and cook time > 2 minutes.
			 * Advanced: with milk, mocha and a figure in the cover.
			 * 
			 * Se definieron los costos de cada condimento agregado
			 * El costo de el tiempo de coccion es de 0
			 * se imprime el costo y descripcion de la bebida
			 */
		
		Beverage simple = new Simple("Cafe simple", 2.5);
		System.out.println("simple= " + simple.getDescription());
		System.out.println("precio: " + simple.cost());
		
		System.out.println();
		
		Beverage elementary = new Elementary("Cafe simple", 3.5);
		elementary = new Milk(elementary, 0.5, "leche");
		
		System.out.println("elementary= " + elementary.getDescription());
		System.out.println("precio: " + elementary.cost());
		
		System.out.println();
	
		Beverage sophisticated = new Sophisticated("Cafe simple", 5.5);
		sophisticated = new Milk(sophisticated, 0.5, "leche");
		sophisticated = new CookTime(sophisticated, "tiempo de coccion mayor a 2 minutos");
		
		System.out.println("sophisticated= " + sophisticated.getDescription());
		System.out.println("precio: " + sophisticated.cost());
		
		System.out.println();
		
		
		Beverage basic = new Basic("Cafe simple", 5.5);
		basic = new CookTime(basic, "tiempo de coccion mayor a 2 minutos");
		
		System.out.println("basic= " + basic.getDescription());
		System.out.println("precio: " + basic.cost());
		
		System.out.println();
		
		Beverage advanced = new Advanced("Cafe simple", 5.5);
		advanced = new Milk(advanced, 0.5, "leche");
		advanced = new Mocha(advanced, 1.5, "mocha");
		advanced = new CookTime(advanced, "tiempo de coccion mayor a 2 minutos");
		
		System.out.println("advanced= " + advanced.getDescription());
		System.out.println("precio: " + advanced.cost());
		
		System.out.println();
		
		
		
		

	}

}
