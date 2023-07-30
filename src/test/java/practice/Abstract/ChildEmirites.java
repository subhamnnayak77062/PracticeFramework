package practice.Abstract;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		ChildEmirites ce = new ChildEmirites();
		
		ce.engine();
		ce.safetyGuidelines();
		ce.bodyColor();
		ce.NewSafetyGuidelines();
		//ParentAirCraft pa = new ParentAirCraft(); // cannot create an instance of an Abstract class
		
		ParentAirCraft pa = new ChildEmirites();
		pa.bodyColor();
		pa.NewSafetyGuidelines();
		pa.engine();
		pa.safetyGuidelines();
	}

	@Override
	void bodyColor() {
		System.out.println("Red color of the aircraft body..");
		
	}

	@Override
	protected void speed() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside try block()...");
		}
		finally{
			System.out.println("Inside Finally...");
		}
	}

	@Override
	public
	void checkAbstract() {
		// TODO Auto-generated method stub
		
	}
	
	
	  static void NewSafetyGuidelines() {
	  System.out.println("static method check in child class.."); }
	 

}
