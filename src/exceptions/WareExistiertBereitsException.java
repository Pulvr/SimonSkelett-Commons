package exceptions;

import valueobjects.Ware;

/**
 * Exception zur Signalisierung, dass ein ware bereits existiert (z.B. bei einem Einf�gevorgang).
 * 
 */
public class WareExistiertBereitsException extends Exception {

	/**
	 * Konstruktor
	 * 
	 * @param ware Das bereits existierende ware
	 * @param zusatzMsg zus�tzlicher Text f�r die Fehlermeldung
	 */
	public WareExistiertBereitsException(Ware ware, String zusatzMsg) {
		super("Ware mit Bezeichnung " + ware.getBezeichnung() + " und Nummer " + ware.getNummer() 
				+ " existiert bereits" + zusatzMsg +" Oder die Waren Nummer ist bereits vergeben.");
	}
}