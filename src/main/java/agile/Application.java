
package agile;

import org.joda.time.DateTime;

/** Entry point of application. **/
public final class Application {

	/**
	 * Private Application main
	 */
	private Application() {
		super();
	}

	/**
	 * Methode main
	 * 
	 * @param args
	 *            tab of args
	 */
	public static void main(final String[] args) {
		System.out.println("Hello world !!!");
		final DateTime date = DateTime.now();
		System.out.println(date);

	}

	/**
	 * Methode ajouter calculatrice
	 * @param entierUn premier paramètre
	 * @param entierDeux second parametre
	 * @return le resultat
	 */
	public static int addFunctionCalculator(final int entierUn, final int entierDeux) {
		return entierUn + entierDeux;
	}

}