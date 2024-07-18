package model;

public class FreshWaterFish extends Fish {

	public FreshWaterFish(String fishSpeciesID, String fishSpeciesName, Integer fishAmount, String aquariumID) {
		super(fishSpeciesID, fishSpeciesName, fishAmount, aquariumID);
	}

	@Override
	public void showFishDetail() {
		// TODO Auto-generated method stub
		System.out.println(getFishSpeciesID() + " | " + getFishSpeciesName() + " | Freshwater | " + getFishAmount()
				+ " | " + getAquariumID());
	}

	@Override
	public void showSellMessage() {
		// TODO Auto-generated method stub
		System.out.println("I will got to the river");
	}

}
