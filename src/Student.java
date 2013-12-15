
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Persoon
{
    private String studentnummer;
    private String studierichting;

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
     * @param  studentnummer studentnummer.
     * @param  studierichting welke studie doet de leerling.
     */
    public Student(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String studentnummer, String studierichting)
    {
       super(bsn,voornaam,achternaam,dag,maand,jaar,geslacht);
       setStudentNummer(studentnummer);
       setStudieRichting(studierichting);
    }
    /**
     * Parameterloze constructor voor klasse Student
     */
    public Student()
    {
       super(); 
    }
    /**
     * Stel een nieuw studentnummer in voor objecten van Klasse Student  
     * @param studentnummer
     */
    public void setStudentNummer(String studentnummer)
    {
        this.studentnummer=studentnummer;
    }
    /**
     * stel een nieuwe studierichting in voor objecten van Klasse Student
     * @param studierichting
     */
    public void setStudieRichting(String studierichting)
    {
        this.studierichting = studierichting;
    }
    /**
     * retourneert het studentnummer van het object van klasse Student
     * @return studentnummer
     */
    public String getStudentNummer()
    {
        return studentnummer;
    }
    /**
     * retourneert de studierichting van het object van klasse Student
     * @return studierichting
     */
    public String getStudieRichting()
    {
        return studierichting;
    }
    /**
     * drukt de informatie van de superklasse persoon en de info specifiek voor Student af.
     */
    public String toString()
    {
    	return super.toString()+"StudentNummer: "+getStudentNummer()+"\n"
    			+ "StudieRichting:      "+getStudieRichting()+"\n";
    }
}
