
public class SimpleFabriqueDePizzaStrasbourg extends SimpleFabriqueDePizzas {
	
	private static SimpleFabriqueDePizzaStrasbourg instance;
	
	private SimpleFabriqueDePizzaStrasbourg() {
		super();
	}
	
	public static SimpleFabriqueDePizzaStrasbourg getInstance() {
		return instance;
	}
		

	public Pizza creerPizza(String type) {
		
		if (type.equals("cheese")) {
			return new PizzaFromageStyleStrasbourg();
		} else if (type.equals("greek")) {
			return new PizzaGrecque();
		} else {
			return new PizzaPoivrons();
		}
	}
	
}
