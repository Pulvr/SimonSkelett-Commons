package valueobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Ein WarenLog der anzeigt der Bestand von welcher Ware ge�ndert wurde ... Mit Datum
 * @author Florian
 *
 */
public class WarenLog {
	
	private SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
	private Date d;
	private String bezeichnung;
	private int nummer;
	private float preis;
	private int bestand;
	
	public WarenLog(Date d, String bezeichnung, int nummer, float preis, int bestand){
		this.d = d;
		this.bezeichnung = bezeichnung;
		this.nummer = nummer;
		this.preis = preis;
		this.bestand = bestand;
	}
	
	public String toString(){
		return ("Datum: " + this.ft.format(this.d) + "\nBezeichnung: " + this.bezeichnung + "\nNummer: " + this.nummer + "\nPreis: " + this.preis + "\nBestand: " + this.bestand + "\n");
	}
	
	public Date getDate(){
		return this.d;
	}
	
	public String getBezeichnung(){
		return this.bezeichnung;
	}
	
	public int getNummer(){
		return this.nummer;
	}
	
	public float getPreis(){
		return this.preis;
	}
	
	public int getBestand(){
		return this.bestand;
	}

}
