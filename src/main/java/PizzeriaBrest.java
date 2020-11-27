
public class PizzeriaBrest extends Pizzeria {

	@Override
	protected
	Pizza creerPizza(String type) {
		
		if (type.equals("cheese")) {
			return new PizzaFromageStyleBrest();
		} else if (type.equals("greek")) {
			return new PizzaGrecqueStyleBrest();
		} else {
			return new PizzaPoivronsStyleBrest();
		}
	}

}
