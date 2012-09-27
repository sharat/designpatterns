/*
 * In computer programming, the adapter pattern (often referred to as the wrapper pattern or simply a wrapper)
 * is a design pattern that translates one interface for a class into a compatible interface.
 * An adapter allows classes to work together that normally could not because of incompatible interfaces, 
 * by providing its interface to clients while using the original interface.
 * The adapter translates calls to its interface into calls to the original interface,
 * and the amount of code necessary to do this is typically small.
 * The adapter is also responsible for transforming data into appropriate forms
 * http://www.c2.com/cgi/wiki?AdapterPattern
 */

interface Stack<T>
{
	public void push(T t);
	public T pop();
	public T top();
}

class DList<T>
{
	public void insert(DNode );
}