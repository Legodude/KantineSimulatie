
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KantineMedewerker extends Persoon
{
    private String medewerkersnummer;
    private boolean kassaToegang;

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
    /**
     * parameterloze constructor voor klasse kantinemedewerker
     */
    public KantineMedewerker()
    {
       super();
    }
    /**
     * stel een nieuw medewerkersnummer in
     * @param medewerkersnummer
     */
    public void setMedewerkersnummer(String medewerkersnummer)
    {
        this.medewerkersnummer=medewerkersnummer;
    }
    /**
     * stel in of de medewerker kassatoegang heeft
     * @param kassaToegang
     */
    public void setKassaToegang(boolean kassaToegang)
    {
        this.kassaToegang = kassaToegang;
    }
    /**
     * retourneert het medewerkersnummer van medewerker
     * @return medewerkersnummer
     */
    public String getMedewerkersnummer()
    {
        return medewerkersnummer;
    }
    /**
     * retourneert of de medewerker kassatoegang heeft
     * @return
     */
    public boolean getKassaToegang()
    {
        return kassaToegang;
    }
    /**
     * drukt alle info uit de superklasse af, en de info specifiek voor medewerker
     */
    public String toString()
    {
    	return super.toString()+"MedewerkersNummer: "+getMedewerkersnummer()+"\n"
    			+ "Kassatoegang:      "+getKassaToegang()+"\n";
    }
}
