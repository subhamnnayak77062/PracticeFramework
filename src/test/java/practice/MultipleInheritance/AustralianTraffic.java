package practice.MultipleInheritance;

public class AustralianTraffic implements CentralTraffic , ContinentalTraffic {

	public static void main(String[] args) {
		
		CentralTraffic ct = new AustralianTraffic();
		ct.greenGo();
		ct.redStop();
		CentralTraffic.flashYellow();
		ct.checkHelmet();
		System.out.println(a);
		
		AustralianTraffic at = new AustralianTraffic();
		at.crossRoad();
		at.flashYellow();
		
		ContinentalTraffic cont = new AustralianTraffic();
		cont.TrainSymbol();
			
	}

	private void crossRoad() {
		System.out.println("walk on traffic...");
	}

	@Override
	public void greenGo() {
		System.out.println("Using greenGo method...");
		
	}

	@Override
	public void redStop() {
		System.out.println("Using redStop method...");
		
	}

	public void flashYellow() {
		System.out.println("Using flashYellow method...");
		
	}

	@Override
	public void TrainSymbol() {
		System.out.println("Trainsymbol() from continental traffic Interface...");
		
	}

	@Override
	public void checkHelmet() {
		// TODO Auto-generated method stub
		System.out.println("inside checkHelmet() inside AustralianTraffic...");
		
	}

	@Override
	public void member() {
		// TODO Auto-generated method stub
		
	}

}
