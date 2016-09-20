package adis_1Package;

public abstract class Computer {
	public int Ram = 10;
	public String Speakers;
	public String Memory;
	public static String father = "CharlesBabbage";

	public void type() {
		System.out.println(Ram);
	}

	public void display() {
	}

	public abstract void MemoryType(Computer MagneticTape);

/*	public Computer Firstcomputer() {
		Computer c2 = new comp
		
		return ;
	}*/

	public Computer() {
		System.out.println("This is CONSTRUCTOR  from computer class");
	}
}
