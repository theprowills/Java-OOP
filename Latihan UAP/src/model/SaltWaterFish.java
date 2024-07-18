package model;

public class SaltWaterFish extends Fish {

	public SaltWaterFish(String fishSpeciasID, String fishSpeciasName, Integer fishAmount, String aquariumID) {
		super(fishSpeciasID, fishSpeciasName, fishAmount, aquariumID);
	}

	public void showFishDetail() {
		// TODO Auto-generated method stub
		System.out.println(getFishSpeciasID() + " | " + getFishSpeciasName() + " | Saltwater | " + getFishAmount()
				+ " | " + getAquariumID());
	}

	@Override
	public void showSellMessage() {
		// TODO Auto-generated method stub
		System.out.println("I will got to the sea");
	}
}
