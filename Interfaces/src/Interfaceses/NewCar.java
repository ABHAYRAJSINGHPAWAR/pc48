package Interfaceses;

public class NewCar  {
	private Engine engine;
	private Media mplay;
	// private Media mplay = new Mediapalyer();
	public NewCar() {
		engine = new PowerEngine();
		mplay =new MediaPlayer();
	}
	
	public NewCar(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.start();
	}
	
	public void stop() {
		engine.stop();
	}
	
	public void acc() {
		engine.acc();
	}
	
	public void startMusic() {
		mplay.start();
	}
	public void stopMusic() {
		mplay.stop();
	}
	
	public void upgradeEngine() {
		this.engine = new EvEngine();
	}
}
