package valueobjects;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * Klasse zur Repräsentation einzelner Waren.
 */
public class Ware implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 918917690547978048L;
	// Attribute zur Beschreibung einer Ware:
	private String bezeichnung;
	private int nummer; 
	private int bestand;
	private float preis;

	public Ware(String bezeichnung, int nr,int bstd, float preis) {
		this.nummer = nr;
		this.bezeichnung = bezeichnung;
		this.bestand= bstd;
		this.preis = preis;
	}
	
	// --- Dienste der Waren-Objekte ---

	/**
	 * Standard-Methode von Object überschrieben.
	 * Methode wird immer automatisch aufgerufen, wenn ein Waren-Objekt als String
	 * benutzt wird (z.B. in println(Ware);)
	 * 
	 * @see java.lang.Object#toString()
	 */
    public String toString() {
        return toString(true);
    }
    
    /**
     * Standard-Methode von Object überschrieben.
     * Methode wird immer automatisch aufgerufen, wenn ein Waren-Objekt als String
     * benutzt wird (z.B. in println(Ware);)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString(boolean mitNeuerZeile) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String ausgabe = bezeichnung + " " + df.format(preis) + "€ / Noch auf Lager: " + bestand;
        if (mitNeuerZeile) {
            // += bedeutet das selbe wie: ausgabe = ausgabe + "\n"
            ausgabe += "\n";
        }
        return ausgabe;
        
    }
	
	/**
	 * Standard-Methode von Object überschrieben.
	 * Methode dient Vergleich von zwei Waren-Objekten anhand ihrer Werte,
	 * d.h. bezeichnung und Nummer.
	 * 
	 * @see java.lang.Object#equals()
	 */
	public boolean equals(Object andereWare) {
		if (andereWare instanceof Ware) 
			return ((this.nummer == ((Ware) andereWare).nummer) 
					&& (this.bezeichnung.equals(((Ware) andereWare).bezeichnung)));
		else
			return false;
	}

	
	/*
	 * Ab hier Accessor-Methoden
	 */
	
	public int getNummer() {
		return this.nummer;
	}
	
	public String getBezeichnung() {
		return this.bezeichnung;
	}
	
	public int getBestand() {
		return this.bestand;
	}
    
    public float getPreis(){
        return this.preis;
    }
    
    public float getRechnungsPreis(){
        return getPreis();
    }
	
	public void setBestand(int bestand){
		this.bestand = bestand;
	}
    
    public boolean checkBestellmengeGueltig(int menge) {
        return true;
    }
}