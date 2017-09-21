
public class SUBcat extends Animal implements INTERpet {

	private String Name;

	public SUBcat(int Legs, String Name) {
		super(Legs);
		this.Name = Name;
	}

	public SUBcat() {
		super(4);
		// this.Name = Name;
	}

	@Override
	public String getName() {
		return Name;
	}

	public String setName(String name) {
		Name = name;
		return Name;
	}

	public void play() {
		System.out.println("The Cat is PLaying");

	}

	@Override
	public String eat() {
		return "It's Eating";
	}

	@Override
	public String setName() {
		// TODO Auto-generated method stub
		return null;
	}

}
