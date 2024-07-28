package model;

public class People {
	private String nama;
	private String code;

	public People(String nama, String code) {
		super();
		this.nama = nama;
		this.code = code;
	}

	public void printIdentity() {
		System.out.println("People's name : " + this.nama);
		System.out.println("People's code : " + this.code);
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
