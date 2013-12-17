// TODO: Auto-generated Javadoc
/**
 * The Class Contant.
 */
public class Contant extends Betaalwijze 
{
	
	/**
	 * Methode om betaling af te handelen.
	 *
	 * @param tebetalen the tebetalen
	 * @throws TeWeinigGeldException the te weinig geld exception
	 */
	public void betaal(double tebetalen) throws TeWeinigGeldException 
	{
		if(saldo >= tebetalen) 
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
	    return "Contant";
	}
	
	/**
	 * returnt het saldo.
	 *
	 * @return saldo
	 */
	public double getSaldo()
	{
	    return saldo;
	}
}