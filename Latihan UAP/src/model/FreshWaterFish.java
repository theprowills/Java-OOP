package model;

public class FreshWaterFish extends Fish {

	public FreshWaterFish(String fishSpeciasID, String fishSpeciasName, Integer fishAmount, String aquariumID) {
		super(fishSpeciasID, fishSpeciasName, fishAmount, aquariumID);
	}

	@Override
	public void showFishDetail() {
		// TODO Auto-generated method stub
		System.out.println(getFishSpeciasID() + " | " + getFishSpeciasName() + " | Freshwater | " + getFishAmount()
				+ " | " + getAquariumID());
	}

	@Override
	public void showSellMessage() {
		// TODO Auto-generated method stub
		System.out.println("I will got to the river");
	}

}
