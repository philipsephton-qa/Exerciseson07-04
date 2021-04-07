package Inheritance;

public class Invertebrates  extends Animal{
	private String hasSpine = true;
	private Boolean canSwim;

	
	public Invertebrates(String name, int lifeSpan, Boolean canSwim) {
		super(name, lifeSpan);
		this.canSwim = canSwim;
	}


	public String getHasSpine() {
		return hasSpine;
	}


	public void setHasSpine(String hasSpine) {
		this.hasSpine = hasSpine;
	}


	public Boolean getCanSwim() {
		return canSwim;
	}


	public void setCanSwim(Boolean canSwim) {
		this.canSwim = canSwim;
	}
	
	
}
