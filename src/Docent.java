
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
    
    public Docent()
    {
       super(); 
    }
    
    public void setVierLetterCode(String vierlettercode)
    {
        this.vierlettercode=vierlettercode;
    }
    
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    
    public String getVierLetterCode()
    {
        return vierlettercode;
    }
    
    public String getAfdeling()
    {
        return afdeling;
    }
    
    public void drukAf()
    {
        /*System.out.println("Naam:              "+getAchterNaam()+", "+getVoorNaam());
        System.out.println("BSN:               "+getBSN());
        System.out.println("Geslacht:          "+getGeslacht());
        System.out.println("GeboorteDatum:     "+getGeboorteDatum());*/
        super.drukAf();
        System.out.println("Afdeling:  "+getAfdeling());
        System.out.println("Vierlettercode: "+getVierLetterCode());
    }
}
