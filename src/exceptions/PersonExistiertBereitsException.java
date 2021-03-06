package exceptions;

import valueobjects.Person;

/**
 * Exception zur Signalisierung, dass eine person bereits existiert (z.B. bei einem Einfügevorgang).
 * 
 */
public class PersonExistiertBereitsException extends Exception {
	
	public PersonExistiertBereitsException(Person einePerson, String zusatzMsg) {
		super("Ware mit Bezeichnung und Nummer  existiert bereits");
	
	}
}
