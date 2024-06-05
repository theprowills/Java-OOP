package model;

public abstract class Animal {

	private String name;
	private String gender;
	private String mood;
//	private String genus;

	public Animal(String name, String gender, String mood) {
		super();
		this.name = name;
		this.gender = gender;
		this.mood = mood;
	}

	//
	public abstract void updateMood(Integer currCanine, Integer currFeline, Integer mostCanine, Integer mostFeline);

	public abstract void printAnimalStatus(Integer number);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

}
