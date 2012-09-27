// The factory method pattern is an object-oriented design pattern 
// to implement the concept of factories. 
// Like other creational patterns, it deals with the problem of creating objects (products) 
// without specifying the exact class of object that will be created. 
// The essence of the Factory method Pattern is to 
// "Define an interface for creating an object,
// but let the classes that implement the interface decide which class to instantiate.
// The Factory method lets a class defer instantiation to subclasses."

class Complex {
	
	private double imaginary;
	private double real;
	
	public static Complex fromCatesianFactory(double real, double imaginary) {
		return new Complex(real,imaginary);
	}
	
	public static Complex fromPolarFactory(double modulus, double angle) {
		return new Complex(modulus* Math.cos(angle), modulus * Math.sin(angle));
	}
	
	public Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
		System.out.println("Number is " + this.real + "+ i" + this.imaginary);
	}
}