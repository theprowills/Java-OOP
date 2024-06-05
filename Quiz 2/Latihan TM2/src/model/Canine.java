package model;

public class Canine extends Animal {

	private int walkingSpeed;

	// constructor
	public Canine(String name, String gender, String mood, int walkingSpeed) {
		super(name, gender, mood);
		this.walkingSpeed = walkingSpeed;
	}

	// getter setter
	public int getWalkingSpeed() {
		return walkingSpeed;
	}

	public void setWalkingSpeed(int walkingSpeed) {
		this.walkingSpeed = walkingSpeed;
	}

	@Override
	public void updateMood(Integer currCanine, Integer currFeline, Integer mostCanine, Integer mostFeline) {
		// TODO Auto-generated method stub
		if (currCanine == 1) {
			setMood("happy");
		} else if (currCanine < mostCanine) {
			setMood("happy");
		} else {
			setMood("unhappy");
		}
	}

	@Override
	public void printAnimalStatus(Integer number) {
		// TODO Auto-generated method stub
		System.out.printf("%d %s %s %s %s", number, getName(), "Canine", getMood(), getGender());

	}

}
