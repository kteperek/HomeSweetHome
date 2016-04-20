package Home;

public class Amplifier implements Device{

	Tuner tuner;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	
	public Amplifier(Tuner tuner, CdPlayer cdPlayer, DvdPlayer dvdPlayer) {
		this.tuner = tuner;
		this.cdPlayer = cdPlayer;
	
	}
	
	
	public void setStereoSound(){
		
	}
	
	public void setVolume(int level){
		
	}

	public void setTuner(Tuner t){
		
	}
	
	public void setDvd(DvdPlayer dvd){
		
	}
	
	public void setCd(CdPlayer cd){
		
	}
	
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}

}
