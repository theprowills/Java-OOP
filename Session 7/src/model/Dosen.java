package model;

public class Dosen extends People {
	private String role;

	public Dosen(String nama, String code, String role) {
		super(nama, code);
		this.role = role;
		// TODO Auto-generated constructor stub
	}

	// ubah nama dan kode dosen
	// update private super class

	public void renameDosen(String nama, String code) {
		super.setNama(nama);
		super.setCode(code);
	}

	@Override
	public void printIdentity() {
		System.out.println("Dosen's name : " + this.getNama());
		System.out.println("Dosen's code : " + this.getCode());
		System.out.println("Dosen's role : " + this.getRole());
		System.out.println();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}