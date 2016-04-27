package Home;

public class Facade {

	private Tuner tuner;
	private Amplifier amplifier;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Projector projector;
	private	Lights lights;
	
	
	public Facade() {
		tuner = new Tuner();
		cdPlayer = new CdPlayer();
		dvdPlayer = new DvdPlayer();
		amplifier = new Amplifier(tuner, cdPlayer, dvdPlayer);
		projector = new Projector();
		lights = new Lights();
	}
	
	public void on() {
		amplifier.on();
		projector.on();
		lights.on();
		
	}
	
	
	
}
