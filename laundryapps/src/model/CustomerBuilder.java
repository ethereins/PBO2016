package model;

public class CustomerBuilder {
	private String id;
	private String nama;
	private String alamat;
	private String noHp;
	
	public CustomerBuilder() {
	}

	public CustomerBuilder setId(String id) {
		this.id = id;
		return this;
	}
	
	public CustomerBuilder setNama(String nama) {
		this.nama = nama;
		return this;
	}
	
	public CustomerBuilder setAlamat(String alamat) {
		this.alamat = alamat;
		return this;
	}
	
	public CustomerBuilder setnoHp(String noHp) {
		this.noHp = noHp;
		return this;
	}
	
	public Customer build() {
		return new Customer(id, nama, alamat, noHp);
	}
}