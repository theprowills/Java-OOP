package model;

import interfaces.BisaBernapas;

public class Ikan extends Hewan implements BisaBernapas {

	public Ikan(String nama) {
		super(nama);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bergerak() {
		// TODO Auto-generated method stub
		System.out.println("ikan berenang");
//		super.bergerak();
	}

	public void makan() {
		System.out.println("ikan sedang makan");
	}

	public void makan(String makanan) {
		System.out.println("ikan makan " + makanan);
	}

	public void bernapas() {
		System.out.println("ikan bernapas pakai insang");
	}

	@Override
	public void BisaBernapas() {
		// TODO Auto-generated method stub
		System.out.println("ikan bisa bernapas");
	}
}
