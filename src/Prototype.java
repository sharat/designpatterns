/*
 * The prototype pattern is a creational design pattern used in software development when the type
 * of objects to create is determined by a prototypical instance, which is cloned to produce new objects.
 * This pattern is used to:
 * -> avoid subclasses of an object creator in the client application, like the abstract factory pattern does.
 * -> avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.
 * http://en.wikipedia.org/wiki/Prototype_pattern
 */

abstract class Prototype implements Cloneable {

	@Override
	public Prototype clone() throws CloneNotSupportedException {
		return (Prototype)super.clone();
	}
	
	public abstract void setX(int x);
	public abstract void printX();
	public abstract int getX();
}

class PrototypeImpl extends Prototype {
	int x;
	public PrototypeImpl(int x) {
		this.x = x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void printX() {
		System.out.println("Value: " + x);
	}
	
	public int getX() { return x; };
}