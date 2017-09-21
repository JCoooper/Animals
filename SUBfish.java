
public class SUBfish extends Animal implements INTERpet {

	String fName;

	protected SUBfish(int Legs) {
		super(Legs);

	}

	public String getName() {
		return fName;
	}

	public String setName() {
		return null;
	}

	public SUBfish() {
		super(0);
		fName = "Piscene";
	}

	public void play() {
		System.out.println("The Fish Is Swimming");
	}

	@Override
	public String eat() {
		return null;
	}

	public void setName(String fName) {
		this.fName = fName;

	}

}
