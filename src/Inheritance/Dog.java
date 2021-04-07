package Inheritance;

public class Dog extends Mammal{
	String breed;
	int age;
	
	public Dog(String name, int lifeSpan, Boolean canSwim, boolean hasWarmBlood, String breed) {
		super(name, lifeSpan, canSwim, hasWarmBlood);
		this.breed = breed;
	}
	
	
	public void bark() {
		System.out.println("Hear me bark");
	}
	public void guard() {
		System.out.println("I'm a good little guard doggy");
	}
	

}
