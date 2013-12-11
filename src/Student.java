
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
    
    public Student()
    {
       super(); 
    }
    
    public void setStudentNummer(String studentnummer)
    {
        this.studentnummer=studentnummer;
    }
    
    public void setStudieRichting(String studierichting)
    {
        this.studierichting = studierichting;
    }
    
    public String getStudentNummer()
    {
        return studentnummer;
    }
    
    public String getStudieRichting()
    {
        return studierichting;
    }
    
    public void drukAf()
    {
        /*System.out.println("Naam:              "+getAchterNaam()+", "+getVoorNaam());
        System.out.println("BSN:               "+getBSN());
        System.out.println("Geslacht:          "+getGeslacht());
        System.out.println("GeboorteDatum:     "+getGeboorteDatum());*/
        System.out.println("studentNummer:  "+getStudentNummer());
        System.out.println("Studierichting: "+getStudieRichting());
    }
}
