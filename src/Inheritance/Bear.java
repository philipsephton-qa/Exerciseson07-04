package Inheritance;

public class Bear extends Animal{
	boolean isHibernating;
	String colour;
	
	public Bear() {}

	public Bear(String name, int lifeSpan, String colour) {
		super(name, lifeSpan);
		this.colour = colour;
	}
	public void food() {
		System.out.println("Hi, I came to see if you had food for me, please dont run away!!!");
	}
	public void fishing() {
		System.out.println("Would you like to try catching some salmon with me!!!");
	}

}
