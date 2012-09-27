// The abstract factory pattern is a software design pattern that 
// provides a way to encapsulate a group of individual factories that have a common them


// Buttons
interface Button 
{
	void paint();
}


class WinButton implements Button {
	public void paint() {
		System.out.println("Windows Button");
	}
}

class OSXButton implements Button {
	public void paint() {
		System.out.println("OSX Button");
	}
}

// Factory implementation
interface GUIFactory {
	public Button createButton();
}

class WinFactory implements GUIFactory {
	public Button createButton()
	{
		return new WinButton();
	}
}

class OSXFactory implements GUIFactory {
	public Button createButton() {
		return new OSXButton();
	}
}
