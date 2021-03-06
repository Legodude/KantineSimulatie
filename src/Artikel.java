
// TODO: Auto-generated Javadoc
/**
 * info over artikelen zoals:
 * naam
 * prijs.
 *
 * @author Nick klein en Robert Stocker
 * @version 1.0
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    /** The Naam. */
    private String Naam;
    
    /** The Prijs. */
    private double Prijs;

    /**
     * constructor voor artikel.
     *
     * @param Naam String de naam van het artikel
     * @param Prijs int de prijs van het artikel per stuk
     */
    public Artikel(String Naam, double Prijs)
    {
        // initialise instance variables
        
        this.Naam = Naam;
        this.Prijs = Prijs;
        
    }
    
    /**
     * parameterloze constructor voor artikel.
     */
    public Artikel()
    {
        // initialise instance variables
        
        Naam = "GEEN";
        Prijs = 0;
        
    }

    /**
     * de naam van he object van de klasse artikel.
     *
     * @return     naam
     */
    public String getNaam()
    {
        return Naam;
    }
    
    /**
     * stel een nieuwe naam in voor het object van de klasse artikel.
     *
     * @param Naam the new naam
     */
    public void setNaam(String Naam)
    {
        this.Naam = Naam;
    }    
    
    /**
     * stel een nieuwe prijs in voor het object van de klasse artikel.
     *
     * @param Prijs the new prijs
     */
    public void setPrijs(double Prijs)
    {
        this.Prijs = Prijs; 
    }
    
    /**
     * de prijs van he object van de klasse artikel.
     *
     * @return     prijs
     */
    public double getPrijs()
    {
        return Prijs;
    }
}
