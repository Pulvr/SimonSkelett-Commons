package de.hsb.simon.commons;

import java.util.List;

import valueobjects.Person;
import valueobjects.Ware;

public interface ServerInterface {
	
	public SessionInterface login(String username,ClientInterface client);
	
	public void broadcastAktualisiertePersonenDaten(List<Person> aktualisierteDaten);
	
	public void broadcastAktualisierteWarenDaten(List<Ware> aktualisierteDaten);
	
}