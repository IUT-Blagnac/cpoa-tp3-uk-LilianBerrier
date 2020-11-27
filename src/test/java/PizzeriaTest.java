import static org.junit.Assert.*;

import org.junit.Test;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
        Pizza miam1 = boutiqueBrest.commanderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
    
    @Test
    public void aCreatedStrasbourgPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new PizzeriaStrasbourg();
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }
    
    @Test
    public void aCreatedCheesePizzaIsNotNull() {
        Pizza miam = new PizzaFromage();
        assertNotNull("A Cheese Pizza Is Not Null", miam);
    }
    
    @Test
    public void aCreatedPoivronsPizzaIsNotNull() {
        Pizza miam = new PizzaPoivrons();
        assertNotNull("A Cheese Pizza Is Not Null", miam);
    }

}