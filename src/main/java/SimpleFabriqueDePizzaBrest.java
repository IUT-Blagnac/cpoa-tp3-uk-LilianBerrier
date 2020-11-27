
public class SimpleFabriqueDePizzaBrest extends SimpleFabriqueDePizzas {
	
	private static SimpleFabriqueDePizzaBrest instance;
	
	private SimpleFabriqueDePizzaBrest() {
		super();
	}
	
	public static SimpleFabriqueDePizzaBrest getInstance() {
		return instance;
	}

	public Pizza creerPizza(String type) {
		if (type.equals("cheese")) {
			return new PizzaFromageStyleBrest();
		} else if (type.equals("greek")) {
			return new PizzaGrecque();
		} else {
			return new PizzaPoivrons();
		}
	}
	
}
