package model;

public class SaltWaterFish extends Fish {

	public SaltWaterFish(String fishSpeciesID, String fishSpeciesName, Integer fishAmount, String aquariumID) {
		super(fishSpeciesID, fishSpeciesName, fishAmount, aquariumID);
	}

	public void showFishDetail() {
		// TODO Auto-generated method stub
		System.out.println(getFishSpeciesID() + " | " + getFishSpeciesName() + " | Saltwater | " + getFishAmount()
				+ " | " + getAquariumID());
	}

	@Override
	public void showSellMessage() {
		// TODO Auto-generated method stub
		System.out.println("I will got to the sea");
	}
}
