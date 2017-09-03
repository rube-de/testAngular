package tutorial;

public class Car {
	private Engine engine;
	
	private String warningMessage;  

	public Car(Engine engine){
		this.engine = engine;
	}
	
	public void accelerate(){
		
		engine.increasRpm();
		if(engine.getRpm() > 5000){
			warningMessage = "Slow Down!";
		}
	}

	public String getWarningMessage() {
		return warningMessage;
	}

	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}
}
