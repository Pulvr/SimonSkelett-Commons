package de.hsb.simon.commons;

import java.io.Serializable;
import java.util.List;

import valueobjects.Person;
import valueobjects.Ware;
import de.root1.simon.SimonUnreferenced;


public interface ClientInterface extends Serializable, SimonUnreferenced{
	
	public void erhalteAktualisiertePersonenDaten(List<Person> aktualisierteDaten);
	
	public void erhalteAktualisierteWarenDaten(List<Ware> aktualisierteDaten);
	
}
