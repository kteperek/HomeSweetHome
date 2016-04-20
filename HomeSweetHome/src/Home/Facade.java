package Home;

public class Facade {

	private Tuner tuner;
	private Amplifier amplifier;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	
	
	public Facade() {
		tuner = new Tuner();
		amplifier = new Amplifier(tuner, cdPlayer, dvdPlayer);
	}
	
	public void on() {
		amplifier.on();
		
	}
	
	
	
}
