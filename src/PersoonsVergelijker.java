
// TODO: Auto-generated Javadoc
/**
 * The Class PersoonsVergelijker.
 */
public class PersoonsVergelijker 
{
	
	/**
	 * constructor, leeg omdat er niks geinitieerd hoeft te worden.
	 */
	public PersoonsVergelijker()
	{
	}
	
	/**
	 * main methode.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) 
	{
		Persoon[] personen = 
		{
			new Persoon(123456,"Henk","Bos",21,9,1995,'M'),
			new Persoon(123456,"Henk","Bos",21,9,1995,'M')
	    };
		System.out.println("persoon 1 en 2 gelijk dmv equals(): "+personen[0].equals(personen[1]));
		System.out.println("persoon 1 en 2 gelijk dmv ==: "+(personen[0]==personen[1]));
	}
}
