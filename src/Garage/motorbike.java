package Garage;

public class motorbike extends vehicle{
	private boolean twoWheeled;
	private int safetyRating;

	public motorbike(String make, String model, int age, boolean twoWheeled, int safetyRating) {
		super(make, model, age);
		this.twoWheeled = twoWheeled;
		this.safetyRating = safetyRating;
	}

	public boolean isTwoWheeled() {
		return twoWheeled;
	}

	public void setTwoWheeled(boolean twoWheeled) {
		this.twoWheeled = twoWheeled;
	}

	public int getSafetyRating() {
		return safetyRating;
	}

	public void setSafetyRating(int safetyRating) {
		this.safetyRating = safetyRating;
	}
	

}