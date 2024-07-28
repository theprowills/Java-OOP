package application;

import model.Mahasiswa;

public class Main {

//	Shif + alt + s -> o

	// Constructor Main
	public Main() {
		Mahasiswa mhs1 = new Mahasiswa("didi", 20, 5, 3.6);
		mhs1.perkenalan();

		mhs1.naikSemester(4);
		mhs1.perkenalan();
		System.out.println();

		// Getter / Setter
		System.out.println(mhs1.getNama());
		System.out.println(mhs1.getIpk());
		System.out.println();

		// Validation
		mhs1.setIpk(100.);
		System.out.println(mhs1.getIpk());

		// Static variable
		System.out.println(mhs1.ipkMaksimal);
		System.out.println(Mahasiswa.ipkMaksimal);
		System.out.println();

		// Static Method
		Mahasiswa.printBinusianTerbaru();

		// Final Variable
		final Double pi = 3.14;
//		pi = 3.0;
	}

	public static void main(String[] args) {
		new Main();

	}

}
