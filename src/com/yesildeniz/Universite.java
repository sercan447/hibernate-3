package com.yesildeniz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Universite_Kurumlari")
public class Universite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Universite_Kodu")
	private int kod;
	
	@Column(name="Universite_IL")
	private String unil;
	
	@Column(name="Kurum_Ismi")
	private String uniisim;
	
	@Column(name="Universite_Bolum")
	private String uniBolum;
	
	public Universite(){}
	
	public Universite(String unil, String uniisim, String uniBolum) {
		super();
		
		this.unil = unil;
		this.uniisim = uniisim;
		this.uniBolum = uniBolum;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public String getUnil() {
		return unil;
	}

	public void setUnil(String unil) {
		this.unil = unil;
	}

	public String getUniisim() {
		return uniisim;
	}

	public void setUniisim(String uniisim) {
		this.uniisim = uniisim;
	}

	public String getUniBolum() {
		return uniBolum;
	}

	public void setUniBolum(String uniBolum) {
		this.uniBolum = uniBolum;
	}
	
	
	
}
