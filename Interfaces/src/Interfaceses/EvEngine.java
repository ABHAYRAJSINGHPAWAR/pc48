package Interfaceses;

public class EvEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Ev engine is start");
		
	}

	@Override
	public void stop() {
		System.out.println("Ev engine is Stop");
		
	}

	@Override
	public void acc() {
		System.out.println("Ev engine is Acc");
		
	}

}
