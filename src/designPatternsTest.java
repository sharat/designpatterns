import org.junit.Test;

public class designPatternsTest {

	@Test
	public void testFactoryMethod()
	{
		System.out.println("Testing Factory Method Pattern");
		System.out.println("------------------------------");
		Complex.fromCatesianFactory(10, 1);
		Complex.fromPolarFactory(2, 30);
	}
	
	@Test
	public void testAbstractFactory()
	{
		System.out.println("Testing Abstract Factory Pattern");
		System.out.println("--------------------------------");
		int nValue;
		nValue = '0';
		createAbstractFactory(nValue);
		nValue = '1';
		createAbstractFactory(nValue);
	}

	private void createAbstractFactory(int nValue) {
		GUIFactory fact = null;
		if(nValue == '0')
			fact = new WinFactory();
		else
			fact = new OSXFactory();
		
		Button b = fact.createButton();
		b.paint();
	}

	
	@Test
	public void testBuilder()
	{
		System.out.println("Testing Builder Pattern");
		System.out.println("-----------------------");
		Waiter w = new Waiter();
		PizzaBuilder pb = new HawaiianPizzaBuilder();
		w.setPizzeBuilder(pb);
		w.constructPizza();
		w.getPizza();
	}
	
	@Test
	public void testPrototype()
	{
		System.out.println("Testing Prototype Pattern");
		System.out.println("-------------------------");
		Prototype proto = new PrototypeImpl(1000);
		
		for(int i = 0; i< 10;i++)
		{
			try {
				Prototype temp;
				temp = proto.clone();
				temp.setX(proto.getX()*i);
				temp.printX();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			
		}
	}

}


// http://en.wikipedia.org/wiki/Adapter_pattern
// http://en.wikipedia.org/wiki/Bridge_pattern
// http://en.wikipedia.org/wiki/Composite_pattern
// http://en.wikipedia.org/wiki/Decorator_pattern
// http://en.wikipedia.org/wiki/Facade_pattern
// http://en.wikipedia.org/wiki/Flyweight_pattern
// http://en.wikipedia.org/wiki/Proxy_pattern
// http://en.wikipedia.org/wiki/Chain-of-responsibility_pattern
// http://en.wikipedia.org/wiki/Command_pattern
// http://en.wikipedia.org/wiki/Interpreter_pattern
// http://en.wikipedia.org/wiki/Iterator_pattern
// http://en.wikipedia.org/wiki/Mediator_pattern
// http://en.wikipedia.org/wiki/Memento_pattern
// http://en.wikipedia.org/wiki/Observer_pattern
// http://en.wikipedia.org/wiki/State_pattern
// http://en.wikipedia.org/wiki/Strategy_pattern
// http://en.wikipedia.org/wiki/Template_method_pattern
// http://en.wikipedia.org/wiki/Visitor_pattern
