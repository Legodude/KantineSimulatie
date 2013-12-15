
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docent extends Persoon
{
    private String vierlettercode;
    private String afdeling;

    /**
     * Constructor.
     *
     * @param  voornaam  First name.
     * @param  achternaam  Last name.
     * @param  bsn  Social security number.
     * @param  geslacht  Gender.
     * @param  geboortedag  Day of birth.
     * @param  geboortemaand  Month of birth.
     * @param  geboortejaar  Year of birth.
     * @param  vierlettercode  vierlettercode
     * @param  afdeling  afdeling
     */
    public Docent(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String vierlettercode, String afdeling)
    {
       super(bsn,voornaam,achternaam,dag,maand,jaar,geslacht);
       setVierLetterCode(vierlettercode);
       setAfdeling(afdeling);
    }
    /**
     * parameterloze constructor voor Docent
     */
    public Docent()
    {
       super(); 
    }
    /**
     * stel een nieuwe vierlettercode in voor docent
     * @param vierlettercode
     */
    public void setVierLetterCode(String vierlettercode)
    {
        this.vierlettercode=vierlettercode;
    }
    /**
     * stel een nieuwe afdeling in voor docent
     * @param afdeling
     */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    /**
     * retourneert de vierlettercode van docent
     * @return vierlettercode
     */
    public String getVierLetterCode()
    {
        return vierlettercode;
    }
    /**
     * retourneert de afdeling van docent
     * @return docent
     */
    public String getAfdeling()
    {
        return afdeling;
    }
    /**
     * drukt alle info van de superklasse persoon af en de info specifiek voor docent
     */
    public String toString()
    {
    	return super.toString()+"Afdeling: "+getAfdeling()+"\n"
    			+ "vierlettercode:      "+getVierLetterCode()+"\n";
    }
}
