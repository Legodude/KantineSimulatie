// TODO: Auto-generated Javadoc
/**
 * The Interface KortingskaartHouder.
 */
public interface KortingskaartHouder {
	
	/**
	 * methode om kortingspercentage op te vragen.
	 *
	 * @return the double
	 */
	public double geefKortingsPercentage();
	
	/**
	 * methode om op te vragen of er maximum per keer aan de korting zit.
	 *
	 * @return true, if successful
	 */
	public boolean heeftMaximum();
	
	/**
	 * methode om het maximum kortingsbedrag op te vragen.
	 *
	 * @return the double
	 */
	public double geefMaximum();
}