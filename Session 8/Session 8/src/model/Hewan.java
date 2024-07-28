package model;

public abstract class Hewan {
	private String nama;

	// encapsulation = construction + getter & setter
	public Hewan(String nama) {
		super();
		this.nama = nama;
	}

	// getter & setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public abstract void bergerak();

	public void bernapas() {
		// TODO Auto-generated method stub

	}

//	public final void bernapas() { // final -> tidak boleh di modif
//		System.out.println("bernapas");
//
//	}

}
