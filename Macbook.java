package adis_1Package;
public class Macbook extends Computer {	
	public void type(){
		System.out.println("This is a MacBook");
	}
	public void display(){
		System.out.println("We use retina display");
	}
	public void Beats(){
		System.out.println("We acquired Beats");
	}
	public void getSpecifications(){
		System.out.println("Entering getSpecifications method ----------specs are as per below ");
		Ram=8;
		Speakers=" Beats";
		Memory = " 250GB";
		father = " Steve Jobs/Steve Wozniak";
		System.out.println(Ram+Speakers+Memory+father);
	}
	@Override
	public void MemoryType(Computer Flash) {
		
		System.out.println("I am MAC,We use flash memory");
	}
	
	public Macbook createMac(){ 
		System.out.println("This is method of type Macbook and out latest MackBookAir features are ");
		Macbook m1=new Macbook();
		m1.Ram=10;
		m1.Memory = "500 GB";
		m1.father = "SteveJobs/Wozniak againnnn"; //ASK HOW WE ARE USING STATIC VAR HERE INSIDE METHOD.
		return m1;  								//Ask doubt about m1 is given so we can return m1.
	}
		
	}

