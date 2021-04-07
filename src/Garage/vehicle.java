package Garage;

public class vehicle {
	private String make;
	private String model;
	private int age;
	
	public vehicle(String make, String model, int age) {
		this.make = make;
		this.model = model;
		this.age = age;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
