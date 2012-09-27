// The builder pattern is an object creation software design pattern. 
// The intention is to abstract steps of construction of objects so that 
// different implementations of these steps can construct different representations of objects.
// Often, the builder pattern is used to build products in accordance with the composite pattern

// Product
class Pizza {
	private String dough = "";
	private String sauce = "";
	private String topping = "";
	
	public void setDough(String dough){ this.dough = dough;  System.out.println("Dough is set as " + this.dough);}
	public void setSauce(String sauce){ this.sauce = sauce;  System.out.println("Sauce is set as " + this.sauce);}
	public void setTopping(String topping){ this.topping = topping; System.out.println("Topping is set as " + this.topping); }
}

abstract class PizzaBuilder
{
	protected Pizza pizza;
	public Pizza getPizza() { return pizza; }
	public void createNewPizzaProduct() { pizza = new Pizza(); }
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}

// Concrete builder
class HawaiianPizzaBuilder extends PizzaBuilder {
	public void buildDough() { pizza.setDough("cross"); }
	public void buildSauce() { pizza.setSauce("mild"); }
	public void buildTopping() { pizza.setTopping("ham+pineapple"); }
}

// Concrete builder
class SpicyPizzaBuilder extends PizzaBuilder {
	public void buildDough() { pizza.setDough("pan baked"); }
	public void buildSauce() { pizza.setSauce("hot"); }
	public void buildTopping() { pizza.setTopping("pepperoni+salami"); }
}

// Director

class Waiter {
	private PizzaBuilder pizzaBuilder;
	public void setPizzeBuilder(PizzaBuilder pb) { this.pizzaBuilder = pb; }
	public Pizza getPizza() { return pizzaBuilder.getPizza(); }
	public void constructPizza() {
		this.pizzaBuilder.createNewPizzaProduct();
		this.pizzaBuilder.buildDough();
		this.pizzaBuilder.buildSauce();
		this.pizzaBuilder.buildTopping();
	}
}
