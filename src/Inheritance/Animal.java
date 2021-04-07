package Inheritance;

public class Animal {
	private String name;
	private int lifeSpan;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
		
	public Animal(String name, int lifeSpan) {
		this.setName(name);
		this.setLifeSpan(lifeSpan);
	}
	public void printAnimal(String name, int lifeSpan) {
		System.out.println("The "+name+" lives for an average of "+lifeSpan+" years.");
	}
	public void jump() {
		System.out.println("Watch me Jump!!!");
	}
	
	public void hunger() {
		System.out.println("I'm always hungry");
	}

}
