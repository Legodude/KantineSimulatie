public abstract class Betaalwijze 
{
	protected double saldo;
	
	/**
	* Methode om krediet te initialiseren
	* @param saldo
	*/
	public void setSaldo(double saldo)
	{
		this.saldo=saldo;
	}
	public abstract String toString();
	public abstract double getSaldo();
	/**
	* Methode om betaling af te handelen
	* @param tebetalen
	*/
	public abstract void betaal(double tebetalen) throws TeWeinigGeldException;
}