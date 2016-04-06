package com.twitter.poruke;

/**
 * Klasa sadrzi potrebne atribute i generisane su get,set i toString metoda.
 * <ul> Metode u klasi:
 * <li> getKorisnik
 * <li> setKorisnik
 * <li> getPoruka
 * <li> setPoruka
 * <li> toString
 * @author Nata
 * 
 *
 */
public class TwitterPoruka {

	/**
	 * String korisnik oznacava ime korisnika.
	 * <b> ime</b>
	 */
	private String korisnik;
	/**
	 * String poruka oznacava teskt poruke na Twitter-u.
	 * <b> tekst poruke</b>
	 */
	private String poruka;
	/**
	 * Metoda koja vraca ime korisnika.
	 * @return
	 */
	public String getKorisnik() {
	return korisnik;
	}
	/**
	 * Metoda koja unosi ime korisnika
	 * @throws RuntimeException
	 * <ul> Nedozvoljene vrednosti
	 * <li> null 
	 * <li> prazan String
	 * @param korisnik
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik == "")
	throw new RuntimeException("Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/**
	 * Metoda vraca String koja oznacava sadrzaj Twitter poruke.
	 * 
	 * @return
	 */
	public String getPoruka() {
	return poruka;
	}
	/**
	 * Metoda kojom unosimo tekst poruke na twitteru.
	 * throws RuntimeException
	 * <ul> Nedozvoljene vrednosti
	 * <li> null
	 * <li> poruka manja od 140 karaktera
	 * @param poruka
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || poruka.length()>140)
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	/**
	 * Metoda koja ispisuje ime korisnika i poruku na Twitteru.
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TwitterPoruka other = (TwitterPoruka) obj;
		if (korisnik == null) {
			if (other.korisnik != null)
				return false;
		} else if (!korisnik.equals(other.korisnik))
			return false;
		if (poruka == null) {
			if (other.poruka != null)
				return false;
		} else if (!poruka.equals(other.poruka))
			return false;
		return true;
	}
	
}


