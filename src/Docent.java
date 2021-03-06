
// TODO: Auto-generated Javadoc
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docent extends Persoon implements KortingskaartHouder
{
    
    /** The vierlettercode. */
    private String vierlettercode;
    
    /** The afdeling. */
    private String afdeling;

    /**
     * Constructor.
     *
     * @param bsn the bsn
     * @param voornaam the voornaam
     * @param achternaam the achternaam
     * @param dag the dag
     * @param maand the maand
     * @param jaar the jaar
     * @param geslacht the geslacht
     * @param vierlettercode the vierlettercode
     * @param afdeling the afdeling
     */
    public Docent(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String vierlettercode, String afdeling)
    {
       super(bsn,voornaam,achternaam,dag,maand,jaar,geslacht);
       setVierLetterCode(vierlettercode);
       setAfdeling(afdeling);
    }
    
    /**
     * parameterloze constructor voor Docent.
     */
    public Docent()
    {
       super(); 
    }
    
    /**
     * stel een nieuwe vierlettercode in voor docent.
     *
     * @param vierlettercode the new vier letter code
     */
    public void setVierLetterCode(String vierlettercode)
    {
        this.vierlettercode=vierlettercode;
    }
    
    /**
     * stel een nieuwe afdeling in voor docent.
     *
     * @param afdeling the new afdeling
     */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    
    /**
     * retourneert de vierlettercode van docent.
     *
     * @return vierlettercode
     */
    public String getVierLetterCode()
    {
        return vierlettercode;
    }
    
    /**
     * retourneert de afdeling van docent.
     *
     * @return docent
     */
    public String getAfdeling()
    {
        return afdeling;
    }
    
    /**
     * drukt alle info van de superklasse persoon af en de info specifiek voor docent.
     *
     * @return the string
     */
    public String toString()
    {
    	return super.toString()+"Afdeling: "+getAfdeling()+"\n"
    			+ "vierlettercode:      "+getVierLetterCode()+"\n";
    }
    
    /**
     * geeft het kortingspercentage voor docent.
     *
     * @return the double
     */
    public double geefKortingsPercentage()
    {
        return 0.25;
    }
    
    /**
     * heeft een maximum-korting?.
     *
     * @return true, if successful
     */
    public boolean heeftMaximum()
    {
        return true;
    }
    
    /**
     * returned maximum in valuta wat je kan krijgen aan korting.
     *
     * @return the double
     */
    public double geefMaximum()
    {
        return 1.0;
    }
}
