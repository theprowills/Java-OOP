package model;

import java.util.Vector;

public class Mahasiswa extends People {
	private Vector<Ukm> ukmList;

	public Mahasiswa(String nama, String code, Vector<Ukm> ukmList) {
		super(nama, code);
		this.ukmList = ukmList;
	}

	@Override
	public void printIdentity() {
		System.out.println("Mhs' name : " + this.getNama());
		System.out.println("Mhs' code : " + this.getCode());
		System.out.println("Mhs' UKM54 list : ");

		int i = 0;
		for (Ukm u : this.ukmList) {

			System.out.printf("%d. %s\n", ++i, u.getName());
		}
		System.out.println();
	}

	public Vector<Ukm> getUkmList() {
		return ukmList;
	}

	public void setUkmList(Vector<Ukm> ukmList) {
		this.ukmList = ukmList;
	}

}
