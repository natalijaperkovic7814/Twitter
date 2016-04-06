package testovi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;


public class TwitterPorukaTest {

	TwitterPoruka tp;
	
	@Before
	public void setUp() throws Exception {
		tp=new TwitterPoruka();
		
	}

	@After
	public void tearDown() throws Exception {
		tp=null;
	}

	@Test
	public void testSetKorisnikSveOk() {
		
		String korisnik="Natalija";
		tp.setKorisnik(korisnik);
		assertEquals(korisnik,tp.getKorisnik());
		
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetKorisnikNull(){
		tp.setKorisnik(null);
		
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString(){
		tp.setKorisnik("");
		
	}
	@Test
	public void testSetPorukaSveOk(){
		String poruka="Proveramo Twitter poruku Natalije";
		tp.setPoruka(poruka);
		assertEquals(poruka, tp.getPoruka());
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPorukaNull(){
		tp.setPoruka(null);
		
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPorukaVecaod140(){
		tp.setPoruka("Nemam ideju za neku pametnu poruku, pa cu zato pisati ovako u prazno."
				+ " Ali ovo je stvarno previse karaktera za moj ukus, ovoliko nisam pisala jos srednje skole"
				+ "na pisemnim zadacima iz srpskog jezika i knjizevnosti. Ovo je ipak malo reci, moracu jos malo da pricam sa Vama"
				+ "mislim da je ovo napokon dovoljno reci u ovoj beskonacno dugoj besedi");
		
	}
	@Test 
	public void testToStringMetode(){
		String korisnik="Novi Twitteras";
		String poruka="Najnovija poruka novog twitterasa";
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		assertEquals("KORISNIK:"+korisnik+" PORUKA:"+poruka,tp.toString());
		
	}

}
