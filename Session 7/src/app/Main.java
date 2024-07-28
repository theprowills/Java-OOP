package app;

import java.util.Vector;

import model.Dosen;
import model.Mahasiswa;
import model.People;
import model.Ukm;

public class Main {

	public Main() {
//		Dosen dosen = new Dosen("abel", "abc", "Site Supervisor");
//		dosen.printIdentity();
//
//		dosen.renameDosen("adi", "123");
//		dosen.printIdentity();

		Vector<Ukm> ukmlist = new Vector<>();
		ukmlist.add(new Ukm("Badmin"));
		ukmlist.add(new Ukm("Basket"));
		ukmlist.add(new Ukm("Futsal"));
		ukmlist.add(new Ukm("Voli"));

		Dosen dosen = new Dosen("abel", "abc", "Site Supervisor");

		((Dosen) dosen).renameDosen("test dosen", "aaa");
		dosen.printIdentity();

		Mahasiswa mhs = new Mahasiswa("nana", "234", ukmlist);
		mhs.printIdentity();

		// bikin 1 vektor untuk dosen + mhs
		//
		Vector<People> peopleList = new Vector<>();
		peopleList.add(dosen);
		peopleList.add(mhs);

		for (People p : peopleList) {
			if (p instanceof Dosen) {
				System.out.println("Ini Dosen");
				p.printIdentity();

				System.out.println("Rename ");
				((Dosen) p).renameDosen("tara", "asa");
			}

			if (p instanceof Mahasiswa) {
				System.out.println("Ini Mahasiswa");
			}

			p.printIdentity();
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}
}