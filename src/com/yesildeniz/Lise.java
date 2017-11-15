package com.yesildeniz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lise_Kurumlari")
public class Lise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Lise_Kodu")
	private int id;
	
	@Column(name="Lise_IL")
	private String liseil;
	
	@Column(name="Lise_Adi")
	private String liseisim;
	
	@Column(name="Lise_Bolum")
	private String liseBolum;
	
	public Lise(){
		
	}

	public Lise(String liseil, String liseisim, String liseBolum) {
		super();
		
		this.liseil = liseil;
		this.liseisim = liseisim;
		this.liseBolum = liseBolum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLiseil() {
		return liseil;
	}

	public void setLiseil(String liseil) {
		this.liseil = liseil;
	}

	public String getLiseisim() {
		return liseisim;
	}

	public void setLiseisim(String liseisim) {
		this.liseisim = liseisim;
	}

	public String getLiseBolum() {
		return liseBolum;
	}

	public void setLiseBolum(String liseBolum) {
		this.liseBolum = liseBolum;
	}
	
	
	
	
}
