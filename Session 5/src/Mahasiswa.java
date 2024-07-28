import java.util.Vector;

public class Mahasiswa {
	private String nama;
	private String jurusan;
	private Vector<MatKul> listMatKul;
	private final NIM nim;

	public Mahasiswa(String nama, String jurusan, Vector<MatKul> listMatKul, NIM nim) {
		super();
		this.nama = nama;
		this.jurusan = jurusan;
		this.listMatKul = listMatKul;
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public Vector<MatKul> getListMatKul() {
		return listMatKul;
	}

	public void setListMatKul(Vector<MatKul> listMatKul) {
		this.listMatKul = listMatKul;
	}

	public NIM getNim() {
		return nim;
	}

}
