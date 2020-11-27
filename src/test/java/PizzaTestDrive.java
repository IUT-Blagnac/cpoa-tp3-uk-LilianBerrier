
public class PizzaTestDrive {
	
    public static void main(String[] args) {
        Pizzeria shopFromBrest = new PizzeriaBrest();
        Pizzeria shopFromStrasbourg = new PizzeriaStrasbourg();

        Pizza pizza = shopFromBrest.commanderPizza("cheese");
        System.out.println("JMB has ordered a " + pizza.getName() + "\n");

        pizza = shopFromStrasbourg.commanderPizza("cheese");
        System.out.println("JMI has ordered a " + pizza.getName() + "\n");
    }
    
}
