import java.util.Vector;

public class Main {

	public Main() {

		Vector<MatKul> listMatKul = new Vector<>();
		listMatKul.add(new MatKul("OOP", "COMP6708"));

		Mahasiswa mhs = new Mahasiswa("Adam", "SI", listMatKul, new NIM("2440075164"));
		Kampus kampus = new Kampus("Binus KMG");

		for (MatKul m : mhs.getListMatKul()) {
			System.out.println(m.getNama());
			System.out.println(m.getKode());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
