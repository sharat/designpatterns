/*
 * In software engineering, the singleton pattern is a design pattern that restricts the instantiation of a class to one object
 * http://en.wikipedia.org/wiki/Singleton_pattern
 */
class Singleton {

	private Singleton() { System.out.println("Initialized Singleton class");} // not allowed
	
	private static class SingletonHolder {
		public static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
