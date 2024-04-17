package Interfaceses;

public class PowerEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Start power engine");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop power engine");
		
	}

	@Override
	public void acc() {
		System.out.println("Acc power engine");
		
	}

}
