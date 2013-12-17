
// TODO: Auto-generated Javadoc
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Persoon
{
    
    /** The studentnummer. */
    private String studentnummer;
    
    /** The studierichting. */
    private String studierichting;

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
     * @param studentnummer the studentnummer
     * @param studierichting the studierichting
     */
    public Student(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String studentnummer, String studierichting)
    {
       super(bsn,voornaam,achternaam,dag,maand,jaar,geslacht);
       setStudentNummer(studentnummer);
       setStudieRichting(studierichting);
    }
    
    /**
     * Parameterloze constructor voor klasse Student.
     */
    public Student()
    {
       super(); 
    }
    
    /**
     * Stel een nieuw studentnummer in voor objecten van Klasse Student.
     *
     * @param studentnummer the new student nummer
     */
    public void setStudentNummer(String studentnummer)
    {
        this.studentnummer=studentnummer;
    }
    
    /**
     * stel een nieuwe studierichting in voor objecten van Klasse Student.
     *
     * @param studierichting the new studie richting
     */
    public void setStudieRichting(String studierichting)
    {
        this.studierichting = studierichting;
    }
    
    /**
     * retourneert het studentnummer van het object van klasse Student.
     *
     * @return studentnummer
     */
    public String getStudentNummer()
    {
        return studentnummer;
    }
    
    /**
     * retourneert de studierichting van het object van klasse Student.
     *
     * @return studierichting
     */
    public String getStudieRichting()
    {
        return studierichting;
    }
    
    /**
     * drukt de informatie van de superklasse persoon en de info specifiek voor Student af.
     *
     * @return the string
     */
    public String toString()
    {
    	return super.toString()+"StudentNummer: "+getStudentNummer()+"\n"
    			+ "StudieRichting:      "+getStudieRichting()+"\n";
    }
}
