package de.hsb.simon.commons;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import valueobjects.Person;
import valueobjects.Rechnung;
import valueobjects.Ware;
import valueobjects.WarenLog;
import de.root1.simon.SimonUnreferenced;
import exceptions.BestellteMengeNegativException;
import exceptions.NichtVielfachesVonPackGroesseException;
import exceptions.PersonExistiertBereitsException;
import exceptions.PersonExistiertNichtException;
import exceptions.WareExistiertBereitsException;
import exceptions.WareExistiertNichtException;


public interface SessionInterface extends Serializable, SimonUnreferenced{

	public ClientInterface getClient();
	
	public List<Ware> gibAlleWaren();
	
	public List<Person> gibAllePersonen();
	
	public List<Ware> sucheNachBezeichnung(String bezeichnung);
	
	public void fuegeWareEin(String bezeichnung, int nummer, int bestand, float preis, int packungsGroesse) throws WareExistiertBereitsException;
	
	public void entferneWare(Ware eineWare)throws WareExistiertNichtException;
	
	public void aendereBestand(Ware w,int neuerBestand)throws WareExistiertNichtException, IOException;
	
	public void fuegePersonEin(int nr, String name, String anr, String strasse, String plz, String ort ,String email, String usr, String pw, boolean ma) 
			throws PersonExistiertBereitsException;
	
	public void personEntfernen(Person einePerson) throws PersonExistiertNichtException;
	
	public void sortiereDieWaren(String aufgabe);
	
	public void schreibeWaren() throws IOException;
	
	public void schreibePersonen() throws IOException;
	
	public void warenkorbKaufen(Person p, Vector<Ware> warenkorb);
	
	public void inWarenKorbLegen(int menge, Ware ware, Person p) throws BestellteMengeNegativException, NichtVielfachesVonPackGroesseException;
	
	public void entferneAusWarenkorb(int menge, Ware ware, Person p)throws BestellteMengeNegativException;
	
	public void warenkorbLeeren(Person p);
	
	public Vector<WarenLog> getWarenLog(String bezeichnung, int daysInPast)throws IOException,ParseException;
	
	public HashMap<String,Person> getMeinePersonenVerwaltung();
	
	public HashMap<String,Ware> getMeineWarenVerwaltung();
	
	public Rechnung getRechnung();
	
	public void setRechnung(Rechnung r);

}
