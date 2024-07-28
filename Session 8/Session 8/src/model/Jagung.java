package model;

import interfaces.BisaBernapas;

public class Jagung implements BisaBernapas {
	public Jagung() {

	}

	@Override
	public void bernapas() {
		// TODO Auto-generated method stub
		System.out.println("jagung bernapas (respirasi) pakai daun");
	}

	@Override
	public void BisaBernapas() {
		// TODO Auto-generated method stub
		System.out.println("jagung bisa bernapas");
	}
}
