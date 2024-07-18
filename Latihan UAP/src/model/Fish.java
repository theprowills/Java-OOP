package model;

public abstract class Fish {
	private String fishSpeciasID;
	private String fishSpeciasName;
	private Integer fishAmount;
	private String aquariumID;

	public Fish(String fishSpeciasID, String fishSpeciasName, Integer fishAmount, String aquariumID) {
		super();
		this.fishSpeciasID = fishSpeciasID;
		this.fishSpeciasName = fishSpeciasName;
		this.fishAmount = fishAmount;
		this.aquariumID = aquariumID;
	}

	public String getFishSpeciasID() {
		return fishSpeciasID;
	}

	public void setFishSpeciasID(String fishSpeciasID) {
		this.fishSpeciasID = fishSpeciasID;
	}

	public String getFishSpeciasName() {
		return fishSpeciasName;
	}

	public void setFishSpeciasName(String fishSpeciasName) {
		this.fishSpeciasName = fishSpeciasName;
	}

	public Integer getFishAmount() {
		return fishAmount;
	}

	public void setFishAmount(Integer fishAmount) {
		this.fishAmount = fishAmount;
	}

	public String getAquariumID() {
		return aquariumID;
	}

	public void setAquariumID(String aquariumID) {
		this.aquariumID = aquariumID;
	}

}
