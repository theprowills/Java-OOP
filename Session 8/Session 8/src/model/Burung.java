package model;

import interfaces.BisaBernapas;

public class Burung extends Hewan implements BisaBernapas {

	public Burung(String nama) {
		super(nama);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bergerak() {
		// TODO Auto-generated method stub
		System.out.println("burung terbang");
	}

	@Override
	public void bernapas() {
		// TODO Auto-generated method stub
		System.out.println("burung bernapas pakai paru-paru");
	}

	@Override
	public void BisaBernapas() {
		// TODO Auto-generated method stub
		System.out.println("burung bisa bernapas");
	}
}
