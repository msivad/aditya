package August;

public class PolymorphismTestDrive {

	// PrintStream out;
	int i;

	public static void main(String[] args) {

		Dog d1 = new Dog();
		Cat c1 = new Cat();

		Dog d2 = new Dog();

		// Animal a1 = new Dog();

		// Animal d1 = new Dog();

		d1.examplePolymorphism(d1);
		c1.examplePolymorphism(c1);

		System.out.println("Printing static  value before update " + d1.grandparent);
		System.out.println("Printing static value  before update " + d2.grandparent);
		System.out.println("Printing static value  before update " + Animal.grandparent);

		// System.out.println("Printing static value " + Animal.name);

		Animal.grandparent = "Animal_2";
		
		//d1.grandparent="Animal_3";

		d1.m1Method();

		System.out.println("Printing static value after update " + d1.grandparent);

		System.out.println("Printing static value after update " + d2.grandparent);

		System.out.println("Printing static value after update " + Animal.grandparent);

		System.out.println("...testing Git")
	}

}
