package practice.Abstract;

public abstract class ParentAirCraft {

	public abstract void checkAbstract();
	
	abstract void bodyColor();
	
	protected abstract void speed();

	public void engine() {
		
		System.out.println("Follow Engine guidelines...");
	}
	
	protected void safetyGuidelines(){
		System.out.println("Follow safety guidelines...");
	}
	static void NewSafetyGuidelines() {
		System.out.println("static method check in Parent class..");
	}
	
	
	
}
