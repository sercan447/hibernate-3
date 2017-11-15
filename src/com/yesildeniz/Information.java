package com.yesildeniz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Type;

@Entity
@Table(name="Informations")
@SecondaryTable(name = "Kullanici_Bilgileri")
public class Information {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numaraSiram")
	protected int numaram;
	
        @Access(value =  AccessType.FIELD)
        @Column(name="Isim",table="Kullanici_Bilgileri",nullable = true , length = 55)
        private String ad;
        @Access(value =  AccessType.FIELD)
        @Column(name="Soyisim" , table="Kullanici_Bilgileri",nullable = true , length = 48)
        private String soyad;
        
        @Access(value = AccessType.FIELD)
        @Column(name="Yas",table = "Kullanici_Bilgileri")
        private int yas;
        
	@Embedded
	@Column(name="Adres_Sistem_No")
	Adresler adresler;
	
        @ElementCollection
        @CollectionTable(name="E_Postalar", joinColumns = @JoinColumn(name="numaraSiram"))
        private List<String> postalar;
      
         @ElementCollection
        @CollectionTable(name="CalisilanSektorler" , joinColumns = @JoinColumn(name = "numaraSiram"))
        private List<String> is;
         
        @ElementCollection
        @CollectionTable(name="Telefonlar" , joinColumns = @JoinColumn(name="numaraSiram"))
        private List<String> telefonlar;
        
	@ManyToMany
	//@JoinColumn(name="Ortaokul_INFO_Id")
	private List<OrtaOgretim> ortaOgretim = new ArrayList<OrtaOgretim>();
	
        
	@ManyToOne
	@JoinColumn(name="Lise_INFO_Id")
	private Lise lise;
	
	@OneToOne
	@JoinColumn(name="Universite_INFO_Id")
	private Universite universite;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name="KayitTarihi")
	private Date tarih;
	
	@Transient
	private String cinsiyet;
	
	@Type(type="yes_no")
	@Column(name="Dunyali_Mi")
	private boolean dunyaliMi;

        	public Information()
                {
                
                }

    public Information(String ad, String soyad, int yas, Adresler adresler, List<String> postalar, 
                       List<String> telefonlar,/*List<String> is,*/ Lise lise, Universite universite,
                       Date tarih, String cinsiyet, boolean dunyaliMi) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.adresler = adresler;
        this.postalar = postalar;
        this.telefonlar = telefonlar;
        //this.is = is;
        this.lise = lise;
        this.universite = universite;
        this.tarih = tarih;
        this.cinsiyet = cinsiyet;
        this.dunyaliMi = dunyaliMi;
     
    }   
        
    public int getNumaram() {
        return numaram;
    }

    public void setNumaram(int numaram) {
        this.numaram = numaram;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Adresler getAdresler() {
        return adresler;
    }

    public void setAdresler(Adresler adresler) {
        this.adresler = adresler;
    }

    public List<String> getPostalar() {
        return postalar;
    }

    public void setPostalar(List<String> postalar) {
        this.postalar = postalar;
    }

    public List<String> getTelefonlar() {
        return telefonlar;
    }

    public void setTelefonlar(List<String> telefonlar) {
        this.telefonlar = telefonlar;
    }
/*
    public List<String> getIs() {
        return is;
    }

    public void setIs(List<String> is) {
        this.is = is;
    }
*/
    public List<OrtaOgretim> getOrtaogretim() {
        return ortaOgretim;
    }

    public void setOrtaogretim(List<OrtaOgretim> ortaogretim) {
        this.ortaOgretim = ortaogretim;
    }

    public Lise getLise() {
        return lise;
    }

    public void setLise(Lise lise) {
        this.lise = lise;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public boolean isDunyaliMi() {
        return dunyaliMi;
    }

    public void setDunyaliMi(boolean dunyaliMi) {
        this.dunyaliMi = dunyaliMi;
    }
        
        
        
		

	
	
}
