package app;

import java.util.ArrayList;

import model.Burung;
import model.Hewan;
import model.Ikan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

	// contructor
	public Main() {

		ArrayList<Hewan> listHewan = new ArrayList<>();

		Ikan i = new Ikan("nemo");

		i.bergerak();
		i.makan();
		i.makan("cacing");
		System.out.println("");

		Burung b = new Burung("kukuruyuk");

		b.bergerak();
		System.out.println("");

		listHewan.add(i);
		listHewan.add(b);

		Burung b2 = new Burung("twit");
		listHewan.add(b2);

		for (Hewan hewan : listHewan) {
			if (hewan instanceof Burung) {
				System.out.println("ini burung " + hewan.getNama());
			} else if (hewan instanceof Ikan) {
				System.out.println("ini ikan " + hewan.getNama());
			}
		}

	}
}
