package Garage;

public class tank extends vehicle{
	private boolean hasCannon;
	private int wheels;
	
	public tank(String make, String model, int age, boolean hasCannon, int wheels) {
		super(make, model, age);
		this.hasCannon = hasCannon;
		this.wheels = wheels;
	}

	public boolean isHasCannon() {
		return hasCannon;
	}

	public void setHasCannon(boolean hasCannon) {
		this.hasCannon = hasCannon;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	

}
