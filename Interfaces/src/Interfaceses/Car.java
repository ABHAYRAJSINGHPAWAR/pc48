package Interfaceses;

public class Car implements Engine,Break,Media  {

	@Override
	public void brake() {
		System.out.println("Break is apply");
		
	}

	@Override
	public void start() {
		System.out.println("Car get Start Engine");
		
	}

	@Override
	public void stop() {
		System.out.println("Car get Stop Engine");
		
	}

	@Override
	public void acc() {
		System.out.println("Car get Acc");
		
	}
	
}
