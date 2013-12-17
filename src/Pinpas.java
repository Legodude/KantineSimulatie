// TODO: Auto-generated Javadoc
/**
 * The Class Pinpas.
 */
public class Pinpas extends Betaalwijze {
	
	/** The kredietlimiet. */
	private double kredietlimiet;
	
	/**
	 * Methode om kredietlimiet te zetten.
	 *
	 * @param kredietlimiet the new krediet limiet
	 */
	public void setKredietLimiet(double kredietlimiet)
	{
	    this.kredietlimiet = kredietlimiet;
	}
	
	/**
	 * Methode om betaling af te handelen.
	 *
	 * @param tebetalen the tebetalen
	 * @throws TeWeinigGeldException the te weinig geld exception
	 */
	public void betaal(double tebetalen) throws TeWeinigGeldException
	{
	    if((saldo + kredietlimiet) >= tebetalen) 
	    {
	        saldo -= tebetalen;
	    }
	    else 
	    {
	        throw new TeWeinigGeldException("Te weinig geld");
	    }
	}
	
	/**
	 * standaard toString methode.
	 *
	 * @return the string
	 */
	public String toString()
	{
	    return "Pinpas";
	}
	
	/**
	 * getsaldo returned het saldo'.
	 *
	 * @return saldo
	 */
	public double getSaldo()
	{
	    return saldo;
	}
}