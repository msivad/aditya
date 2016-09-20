package adis_1Package;

public class SuperComputer {

	public static void main(String[] args) {

		Windows w= new Windows();
		w.type();
		w.display();
		w.MemoryType(w);//Ask doubt if w is passed to SSD
		
		Macbook m1 = new Macbook(); // Ask doubt if we have to declare m1 here again inspite m1 being in Macbook Class.
		Macbook m=new Macbook();
		m.type();
		m.display();
		m.MemoryType(m); //Ask DOUBT if m is passed to flash
		m.getSpecifications();
		m.Beats();
		System.out.println("Output from macbook class" + m1.father);
		System.out.println("Output from main method" + m.father);
		System.out.println("This is father value before update" + Computer.father);
		Computer.father="Conclusion is,if not for charles there would be no computers"; //Ask doubt why we are getting error when put in another class
		System.out.println(Computer.father);
		
	}

}
