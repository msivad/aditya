package August;

public abstract class Animal {
	
	public String type;
	public String name;
	public int weight;
	
	public static String grandparent = "Animal_1";
	//private String breed = "Non Veg";
	
	 public void eat()
	{
		System.out.println("This is Animal's eat method");
		
		//static int i = 10;
	}
	 
	 public abstract void makeSound();
	 
	 public  abstract void examplePolymorphism(Animal a1);
	 
	 public Animal()
	 {
		 System.out.println("...Calling Animal's constrictor");
	 }
}
