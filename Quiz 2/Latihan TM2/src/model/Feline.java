package model;

public class Feline extends Animal {

	// constructor
	public Feline(String name, String gender, String mood) {
		super(name, gender, mood);
	}

	@Override
	public void updateMood(Integer currCanine, Integer currFeline, Integer mostCanine, Integer mostFeline) {
		// TODO Auto-generated method stub
		if (currFeline == 1) {
			setMood("unhappy");
		} else if (currFeline < mostFeline) {
			setMood("unhappy");
		} else {
			setMood("happy");
		}
	}

	@Override
	public void printAnimalStatus(Integer number) {
		// TODO Auto-generated method stub
		System.out.printf("%d %s %s %s %s", number, getName(), "Feline", getMood(), getGender());
	}

}
