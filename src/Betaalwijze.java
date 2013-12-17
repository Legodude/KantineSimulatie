// TODO: Auto-generated Javadoc
/**
 * The Class Betaalwijze.
 */
public abstract class Betaalwijze 
{
	
	/** The saldo. */
	protected double saldo;
	
	/**
	 * Methode om krediet te initialiseren.
	 *
	 * @param saldo the new saldo
	 */
	public void setSaldo(double saldo)
	{
		this.saldo=saldo;
	}
	
	/**
	 * standaard toString methode.
	 *
	 * @return the string
	 */
	public abstract String toString();
	
	/**
	 * returnt het saldo.
	 *
	 * @return saldo
	 */
	public abstract double getSaldo();
	
	/**
	 * Methode om betaling af te handelen.
	 *
	 * @param tebetalen the tebetalen
	 * @throws TeWeinigGeldException the te weinig geld exception
	 */
	public abstract void betaal(double tebetalen) throws TeWeinigGeldException;
}