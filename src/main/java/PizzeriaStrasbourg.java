
public class PizzeriaStrasbourg extends Pizzeria {
	
	@Override
	protected
	Pizza creerPizza(String type) {
		
		if (type.equals("cheese")) {
			return new PizzaFromageStyleStrasbourg();
		} else if (type.equals("greek")) {
			return new PizzaGrecqueStyleStrasbourg();
		} else {
			return new PizzaPoivronsStyleStrasbourg();
		}
	}
	
}
