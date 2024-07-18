package model;

public class Aquarium {
	private String aquariumID;
	private String aquariumColor;
	private Integer aquariumCapacity;

	public Aquarium(String aquariumID, String aquariumColor, Integer aquariumCapacity) {
		super();
		this.aquariumID = aquariumID;
		this.aquariumColor = aquariumColor;
		this.aquariumCapacity = aquariumCapacity;
	}

	public void showAquariumData() {
		System.out.println(aquariumID + " | " + aquariumColor + " | " + aquariumCapacity + " | ");
	}

	public String getAquariumID() {
		return aquariumID;
	}

	public void setAquariumID(String aquariumID) {
		this.aquariumID = aquariumID;
	}

	public String getAquariumColor() {
		return aquariumColor;
	}

	public void setAquariumColor(String aquariumColor) {
		this.aquariumColor = aquariumColor;
	}

	public Integer getAquariumCapacity() {
		return aquariumCapacity;
	}

	public void setAquariumCapacity(Integer aquariumCapacity) {
		this.aquariumCapacity = aquariumCapacity;
	}
}
