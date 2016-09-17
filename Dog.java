package August;

public  class Dog extends Animal 
//implements pet 
{

	public void eat() // this is override version of eat method
	{
		System.out.println("This is Dog's eat method");
	}
	
	public void makeSound()
	{
		System.out.println("This is Dog's makeSound method...bow.. bow");
	}
	
	public void investigate()
	{
		System.out.println("This is pet's investigate method");
	}
	
	public void getDetails()
	{
		System.out.println("The dogs name is " + name + " This dog is of type " + type + " And it's weight is " + weight );
		//System.out.println("The breed is" + breed);
	
}
	public Animal createDog()
	{
		System.out.println("Inside Dogs.. createDog method");
		Dog dog2 = new Dog();
		dog2.weight=20;
		dog2.type = "Not Wild";
		dog2.name = "Tommy";
		return dog2;
	}
	
	public void examplePolymorphism(Animal a1)
	{
		System.out.println("This is Dog's override method for examplePolymorphism ");
	}
	
	public Dog()
	{
		// compiler adds a super here
		System.out.println("..Calling Dog's constuctor");
		
	}
	
	public void m1Method()
	{
		System.out.println("Calling m1Method started....");
		m2Method();
		System.out.println("Calling m1Method ended....");
		
	}
	public void m2Method()
	{
		System.out.println("Calling m2Method started....");
		m3Method();
		System.out.println("Calling m2Method ended....");
		
	}
	public void m3Method()
	{
		System.out.println("Calling m3Method started....");
		
		System.out.println("Calling m3Method ended....");
	}
}
