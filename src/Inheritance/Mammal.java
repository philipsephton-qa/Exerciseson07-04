package Inheritance;

public class Mammal extends Invertebrates{
	private boolean hasMGlands = true;
	private boolean hasWarmBlood;
	
	public Mammal(String name, int lifeSpan, Boolean canSwim, boolean hasWarmBlood) {
		super(name, lifeSpan, canSwim);
		this.hasWarmBlood = hasWarmBlood;
		}

	public boolean isHasMGlands() {
		return hasMGlands;
	}

	public void setHasMGlands(boolean hasMGlands) {
		this.hasMGlands = hasMGlands;
	}

	public boolean isHasWarmBlood() {
		return hasWarmBlood;
	}

	public void setHasWarmBlood(boolean hasWarmBlood) {
		this.hasWarmBlood = hasWarmBlood;
	}
	


}
