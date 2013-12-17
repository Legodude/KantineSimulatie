
// TODO: Auto-generated Javadoc
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KantineMedewerker extends Persoon implements KortingskaartHouder
{
    
    /** The medewerkersnummer. */
    private String medewerkersnummer;
    
    /** The kassa toegang. */
    private boolean kassaToegang;

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
     * @param medewerkersnummer the medewerkersnummer
     * @param kassaToegang the kassa toegang
     */
    public KantineMedewerker(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String medewerkersnummer, boolean kassaToegang)
    {
       super(bsn,voornaam,achternaam,dag,maand,jaar,geslacht);
       setMedewerkersnummer(medewerkersnummer);
       setKassaToegang(kassaToegang);
    }
    
    /**
     * parameterloze constructor voor klasse kantinemedewerker.
     */
    public KantineMedewerker()
    {
       super();
    }
    
    /**
     * stel een nieuw medewerkersnummer in.
     *
     * @param medewerkersnummer the new medewerkersnummer
     */
    public void setMedewerkersnummer(String medewerkersnummer)
    {
        this.medewerkersnummer=medewerkersnummer;
    }
    
    /**
     * stel in of de medewerker kassatoegang heeft.
     *
     * @param kassaToegang the new kassa toegang
     */
    public void setKassaToegang(boolean kassaToegang)
    {
        this.kassaToegang = kassaToegang;
    }
    
    /**
     * retourneert het medewerkersnummer van medewerker.
     *
     * @return medewerkersnummer
     */
    public String getMedewerkersnummer()
    {
        return medewerkersnummer;
    }
    
    /**
     * retourneert of de medewerker kassatoegang heeft.
     *
     * @return the kassa toegang
     */
    public boolean getKassaToegang()
    {
        return kassaToegang;
    }
    
    /**
     * drukt alle info uit de superklasse af, en de info specifiek voor medewerker.
     *
     * @return the string
     */
    public String toString()
    {
    	return super.toString()+"MedewerkersNummer: "+getMedewerkersnummer()+"\n"
    			+ "Kassatoegang:      "+getKassaToegang()+"\n";
    }
    
    /**
     * geef het kortingspercentage.
     *
     * @return korting
     */
    public double geefKortingsPercentage()
    {
        return 0.35;
    }
    
    /**
     * heeft kantinemedewerker maximum?.
     *
     * @return true, if successful
     */
    public boolean heeftMaximum()
    {
        return false;
    }
    
    /**
     * geef het maximum van kantinemedewerker.
     *
     * @return the double
     */
    public double geefMaximum()
    {
        return 0.0;
    }
}
