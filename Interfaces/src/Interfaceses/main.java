package Interfaceses;

public class main {

	public static void main(String[] args) {
		
//		Engine car = new Car();
//		
//		car.acc();
//		car.start();
//		car.stop();
//
//		System.out.println();
//		
//		Car car1 = new Car();
//		car1.acc();
//		car1.start();
//		car1.stop();
//		
//		System.out.println();
//		
//		Media m = new Car();
//		m.start();
		
		NewCar newcar = new NewCar();
		
		newcar.start();
		
		newcar.stopMusic();
		
		newcar.upgradeEngine();
		
		newcar.start();
	}

}
