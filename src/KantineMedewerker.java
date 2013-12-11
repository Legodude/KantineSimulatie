
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KantineMedewerker extends Persoon
{
    private String medewerkersnummer; //Employee nuber
    private boolean kassaToegang; //Does this employee have access to the cash register?

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
     * @param  medewerkersnummer  Employee number.
     * @param  kassaToegang  Does this employee have access to the cash register?
     */
    public KantineMedewerker(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String medewerkersnummer, boolean kassaToegang)
    {
       super(bsn,voornaam,achternaam,dag,maand,jaar,geslacht);
       setMedewerkersnummer(medewerkersnummer);
       setKassaToegang(kassaToegang);
    }
    
    public KantineMedewerker()
    {
       super(); //Using inheritance.
    }
    
    public void setMedewerkersnummer(String medewerkersnummer)
    {
        this.medewerkersnummer=medewerkersnummer;
    }
    
    public void setKassaToegang(boolean kassaToegang)
    {
        this.kassaToegang = kassaToegang;
    }
    
    public String getMedewerkersnummer()
    {
        return medewerkersnummer;
    }
    
    public boolean getKassaToegang()
    {
        return kassaToegang;
    }
    
    public void drukAf()
    {
        /*System.out.println("Naam:              "+getAchterNaam()+", "+getVoorNaam());
        System.out.println("BSN:               "+getBSN());
        System.out.println("Geslacht:          "+getGeslacht());
        System.out.println("GeboorteDatum:     "+getGeboorteDatum());*/
        System.out.println("MedewerkersNummer: "+getMedewerkersnummer());
        System.out.println("Kassatoegang:      "+getKassaToegang());
    }
}
