
public abstract class Animal {

	protected int Legs;

	protected Animal(int Legs) {
		this.Legs = Legs;
	}

	public abstract String eat();

	public String walk() {
		return "This Animal Walks on " + Legs + " legs";
	}
}
