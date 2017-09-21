public class AnimalTester {

	public static void main(String[] args) {

		// Define some Animals
		SUBfish fish1 = new SUBfish();
		SUBcat cat1 = new SUBcat();
		SUBspider spider1 = new SUBspider();
		SUBcat cat2 = new SUBcat(4, "Fluffy");

		// Now let's test things out
		System.out.println("Fish: " + fish1.getName());
		fish1.play();
		System.out.println(fish1.walk());
		System.out.println(fish1.eat());
		fish1.setName("Goldy");
		System.out.println("New name: " + fish1.getName() + "\n");

		System.out.println("Cat: " + cat1.getName());
		cat1.play();
		System.out.println(cat1.walk());
		System.out.println(cat1.eat());
		cat1.setName("Felix");
		System.out.println("New name: " + cat1.getName() + "\n");

		System.out.println(spider1.walk());
		System.out.println(spider1.eat() + "\n");

		System.out.println("Cat: " + cat2.getName());
		cat2.play();
		System.out.println(cat2.walk());
		System.out.println(cat2.eat() + "\n");
	}
}