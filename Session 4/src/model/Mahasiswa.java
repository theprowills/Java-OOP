package model;

public class Mahasiswa {
	private String nama;
	private Integer umur;
	private Integer semester;
	private Double ipk;

	// Static
	public static Double ipkMaksimal = 4.0;

	public Mahasiswa(String nama, Integer umur, Integer semester, Double ipk) {
//		super();
		this.nama = nama;
		this.umur = umur;
		this.semester = semester;
		this.ipk = ipk;
	}

	// method
	public void perkenalan() {
		System.out.println("Nama saya " + this.nama + ". Saya Semester " + this.semester);
	}

	public void naikSemester(Integer jumlahSemester) {
		Integer semesterSekarang = this.semester + jumlahSemester;
		this.semester = semesterSekarang;
	}

	// Getter / Setter
	public Double getIpk() {
		return ipk;
	}

	public void setIpk(Double ipk) {
		if (ipk >= 4.0) {
			System.out.println("IPK Maksimal 4.0");
		} else {
			this.ipk = ipk;
		}
	}

	public String getNama() {
		return nama;
	}

	public static void printBinusianTerbaru() {
		System.out.println("B27");

	}

}
