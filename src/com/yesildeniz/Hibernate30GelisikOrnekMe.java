
package com.yesildeniz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class Hibernate30GelisikOrnekMe {

    public static void main(String[] args) {
      
        	
		Adresler adresler = new Adresler("NORVEC", "Sthockhalm", "48");
		
		OrtaOgretim ortaogretim = new OrtaOgretim("Muğla", "Niyaz Egitim Vakfı İ.Ö.Okulu");
		Lise lise = new Lise("Aydın", "Levent Ticaret Meslek Lisesi", "Muhasebe Finansman");
		Universite universite = new Universite("ISPARTA", "Süleyman Demirel Üniversitesi", "Bilgisayar Mühendisligi");
		
		List<String> postalar = new ArrayList<String>();
                             postalar.add("ahmet_altan@mynet.com");
                             postalar.add("ahmetal@hotmail.com");
                             postalar.add("altanahmet@gmail.com");   
                
                List<String> telefonlar = new ArrayList<String>();
                             telefonlar.add("0538 569 36 59");
                             telefonlar.add("0544 259 63 21");
                             telefonlar.add("0535 475 36 98");

            
                                 
             Information infor = new Information("AHMET","ALTAN",25,adresler,postalar,telefonlar,/*isler,*/
                                                 lise,universite,new Date(),"Erkek",true);
             
                                infor.getOrtaogretim().add(ortaogretim);
                                
                                
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction TR = session.beginTransaction();
		
		session.save(ortaogretim);
		session.save(lise);
                session.save(universite);
		
                    session.save(infor);
		
		TR.commit();
        
    }
    
}
