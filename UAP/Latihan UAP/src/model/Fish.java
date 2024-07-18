package model;

public abstract class Fish {
	private String fishSpeciesID;
	private String fishSpeciesName;
	private Integer fishAmount;
	private String aquariumID;

	public Fish(String fishSpeciesID, String fishSpeciesName, Integer fishAmount, String aquariumID) {
		super();
		this.fishSpeciesID = fishSpeciesID;
		this.fishSpeciesName = fishSpeciesName;
		this.fishAmount = fishAmount;
		this.aquariumID = aquariumID;
	}

	public abstract void showFishDetail();

	public abstract void showSellMessage();

	public String getFishSpeciesID() {
		return fishSpeciesID;
	}

	public void setFishSpeciesID(String fishSpeciesID) {
		this.fishSpeciesID = fishSpeciesID;
	}

	public String getFishSpeciesName() {
		return fishSpeciesName;
	}

	public void setFishSpeciesName(String fishSpeciesName) {
		this.fishSpeciesName = fishSpeciesName;
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
