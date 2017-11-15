package com.yesildeniz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrtaOgretim_Kurumlari")
public class OrtaOgretim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="OrtaOgretim_Kodu")
	private int essiz;
	
	@Column(name="OrtaOkul_IL")
	private String ortail;
	
	@Column(name="OrtaOkul_Adi")
	private String ortaisim;
	public OrtaOgretim(){}

	public OrtaOgretim( String ortail, String ortaisim) {
		super();
		
		this.ortail = ortail;
		this.ortaisim = ortaisim;
	}

	public int getEssiz() {
		return essiz;
	}

	public void setEssiz(int essiz) {
		this.essiz = essiz;
	}

	public String getOrtail() {
		return ortail;
	}

	public void setOrtail(String ortail) {
		this.ortail = ortail;
	}

	public String getOrtaisim() {
		return ortaisim;
	}

	public void setOrtaisim(String ortaisim) {
		this.ortaisim = ortaisim;
	}
	
	
	
	
	
}
