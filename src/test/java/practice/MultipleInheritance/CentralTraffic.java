package practice.MultipleInheritance;

public interface CentralTraffic {
	
		int a=4;
		public void greenGo();
		public void redStop();
		public static void flashYellow() {
			System.out.println("inside static flashYellow() declared in the CentralTraffic Interface...");
		}
		default void checkHelmet() {
			System.out.println("inside default checkHelmet() declared in the CentralTraffic Interface...");
		}
		public abstract void member();

		
}
