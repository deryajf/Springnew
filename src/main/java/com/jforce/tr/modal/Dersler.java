package com.jforce.tr.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dersler")
public class Dersler{
	
	@Id
	private Integer Id;
	
	@Column(name = "ders_kodu")
	private String dersKodu;
	
	@Column(name = "ders_adi")
	private String dersAdi;

	@Column(name = "ders_ortalamsi")
	private Double dersOrtalamasi;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDersKodu() {
		return dersKodu;
	}

	public void setDersKodu(String dersKodu) {
		this.dersKodu = dersKodu;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public double getDersOrtalamasi() {
		return dersOrtalamasi;
	}

	public void setDersOrtalamasi(double dersOrtalamasi) {
		this.dersOrtalamasi = dersOrtalamasi;
	}
	
	
	

}