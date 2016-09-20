package adis_1Package;

public class Windows extends Computer{

	@Override
	public void MemoryType(Computer SSD) {
		System.out.println("we have memory type-solid state drive");		
	}
	
	public void type(){
		System.out.println("This is a windows PC");
	}
	
	public void display(){
	
	System.out.println("We use LCD/LED Display");
	}
	
	public Windows(){
		System.out.println("This is windows constructor");
	}
	
	
}
