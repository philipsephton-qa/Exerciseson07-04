package Garage;

public class car extends vehicle{
	private boolean isElectric;
	private boolean engineWorking;

	public car(String make, String model, int age, boolean isElectric, boolean engineWorking) {
		super(make, model, age);
		this.isElectric = isElectric;
		this.engineWorking = engineWorking;
		}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public boolean isEngineWorking() {
		return engineWorking;
	}

	public void setEngineWorking(boolean engineWorking) {
		this.engineWorking = engineWorking;
	}
	

	
}
