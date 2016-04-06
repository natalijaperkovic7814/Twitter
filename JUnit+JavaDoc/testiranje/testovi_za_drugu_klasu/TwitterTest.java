package testovi_za_drugu_klasu;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import com.twitter.Twitter;
import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	
	Twitter t1;
	
	@Before
	public void setUp() throws Exception {
		t1=new Twitter();

		
	}

	@After
	public void tearDown() throws Exception {
		t1=null;
		
		
	}

	@Test 
	public void testVratiSvePoruke() {
		
		TwitterPoruka tp1=new TwitterPoruka();
		TwitterPoruka tp2=new TwitterPoruka();;
		LinkedList<TwitterPoruka> poruke=new LinkedList<TwitterPoruka>();
		
		String korisnik="Natalija";
		String korisnik1="Marija";
		String poruka="Natalijina poruka";
		String poruka1="Marijina poruka";
		t1.unesi(korisnik, poruka);
		t1.unesi(korisnik1, poruka1);
		tp1.setKorisnik(korisnik);
		tp1.setPoruka(poruka);
		tp2.setKorisnik(korisnik1);
		tp2.setPoruka(poruka1);
		poruke.addLast(tp1);
		poruke.addLast(tp2);
		assertEquals(tp1, poruke.get(0));
 		assertEquals(tp2, poruke.get(1));
		
	}
		@Test(expected = java.lang.RuntimeException.class)
	 	public void testVratiSvePorukeNull() {
	 		t1.unesi(null, null);
	 		t1.vratiSvePoruke();
	 	}
	 	
	 	@Test(expected = java.lang.RuntimeException.class)
	 	public void testVratiSvePorukePrazan() {
	 		t1.unesi("", "");
	 		t1.vratiSvePoruke();
	 	}
 	@Test
 	public void testUnesiSveOk() {
 		LinkedList<TwitterPoruka> poruka = new LinkedList<TwitterPoruka>();
 		TwitterPoruka tp1 = new TwitterPoruka();
 		
 		String poruka1 = "Natalija poruka";
 		
 		String korisnik1 = "Natalija";
 		
 		
 		
 		tp1.setKorisnik(korisnik1);
 		tp1.setPoruka(poruka1);
 		t1.unesi(korisnik1, poruka1);
 	
 		
		poruka.addLast(tp1);
 		
 		
 		  assertEquals(poruka,t1.vratiSvePoruke());
  	
 		
 		
 }
	@Test
 	public void testVratiPorukeSveOk() {
		TwitterPoruka tp1=new TwitterPoruka();
		
		t1.unesi("Natalija","Natalijina poruka");

		t1.unesi("Marija", "Marijina poruka");
		TwitterPoruka [] niz=new TwitterPoruka[1];
		tp1.setKorisnik("Natalija");
		tp1.setPoruka("Natalijina poruka");
		niz[0]=tp1;
		TwitterPoruka[] dobarNiz=t1.vratiPoruke(1, "poruka");
		assertArrayEquals(niz,dobarNiz);
		
 	}
 
 	@Test (expected = java.lang.RuntimeException.class)
 	public void testVratiPorukeNull() {
 		t1.vratiPoruke(1, null);
 	}
 	
 	@Test (expected = java.lang.RuntimeException.class)
 	public void testVratiPorukePrazan() {
 		t1.vratiPoruke(1, "");
 	}

}
