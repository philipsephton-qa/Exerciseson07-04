package Inheritance;

public class Snake extends Animal{
	boolean legs = false;
	boolean poisonous;
	
	public Snake() {}

	public Snake(String name, int lifeSpan, boolean poisonous) {
		super(name, lifeSpan);
		this.poisonous = poisonous;
	}
	public void slither() {
		System.out.println("Who needs legs!!!");
	}
	public void bite() {
		System.out.println("I bet your hoping im not poisonous!!!");
	}
	

}
