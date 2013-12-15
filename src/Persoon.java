/**
 * houd alle info van persoon bij:
 * bsn
 * voornaam
 * achternaam
 * geboortedatum
 * geslacht
 * 
 * @author Nick Klein en Robert Stocker 
 * @version 1.0
 */

import java.util.Date;
import java.text.*;
public class Persoon
{
    // instance variables - replace the example below with your own
    private int bsn;
    private String voornaam;
    private String achternaam;
    private int dag = 0;
    private int maand = 0;
    private int jaar = 0;
    private char geslacht;
    private Dienblad dienblad;
    
    /**
     * constructor voor objects van klasse persoon
     * @param bsn int Burgerservicenummer
     * @param voornaam String Voornaam van Persoon
     * @param achternaam String Achternaam van persoon
     * @param dag int geboortedag van persoon
     * @param maand int geboortemaand van persoon
     * @param jaar int geboortemaand van persoon
     * @param geslacht char 'M','V','O' voor mannelijk/vrouwlijk/ongedefinieerd
     */
    public Persoon(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht)
    {
        this.bsn = bsn;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        setDatum(dag, maand, jaar);
        setGeslacht(geslacht);
    }
    /**
     *parameterloze constructor voor object van klasse persoon
     *setDatum wordt de datum gezet waarneer deze wordt gecreerd
     */
    public Persoon()
    {
      this.bsn = 0;
      this.voornaam = "Onbekend";
      this.achternaam = "Onbekend";
      Date date = new Date();
      SimpleDateFormat dag = 
      new SimpleDateFormat ("d");
      SimpleDateFormat maand = 
      new SimpleDateFormat ("M");
      SimpleDateFormat jaar = 
      new SimpleDateFormat ("y");
      setDatum(Integer.parseInt(dag.format(date)),Integer.parseInt(maand.format(date)),Integer.parseInt(jaar.format(date)));
      setGeslacht('O');
        
    }
     
    /**
     * methode om geboortedatum van een object van klasse persoon te veranderen
     * @param dag int geboortedag van persoon
     * @param maand int geboortemaand van persoon
     * @param jaar int geboortemaand van persoon 
     */
    public void setDatum(int dag, int maand, int jaar)
    {
       if(jaar>1900&&jaar<2100)
       {
            switch(maand)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if(dag<=31&&dag>0)
                    {
                        this.dag = dag;
                        this.maand = maand;
                        this.jaar = jaar;
                    }
                    else {System.out.println("[ERR] geen geldige dag");}
                    break;
                case 2:
                    if(dag>0&&dag<=28)
                    {
                        
                        this.dag = dag;
                        this.maand = maand;
                        this.jaar = jaar;
                    }
                    else if(dag==29)
                    {
                        if((jaar%4==0&&(!(jaar%100==0)))||jaar%400==0)
                        {
                            //het is een schrikkeljaar
                            this.dag = dag;
                            this.maand = maand;
                            this.jaar = jaar;
                        }
                        else System.out.println("[ERR] alleen in schrikkeljaren");
                    }
                    else{ System.out.println("[ERR] geen geldige dag");}
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                case 12:
                    if(dag<=30&&dag>0)
                    {
                        this.dag = dag;
                        this.maand = maand;
                        this.jaar = jaar;
                    }
                    else {System.out.println("[ERR] geen geldige dag");}
                    
                break;
                default:
                System.out.println("[ERR] geen geldige maand");
                break;
            }
       }
       else {System.out.println("[ERR] geen geldig jaar");}
    }
    /**
     * methode om het geslacht van een object van klasse Persoon te veranderen
     * @param geslacht char nieuwe geslacht van object
     */
    public void setGeslacht(char geslacht){
        if(Character.toUpperCase(geslacht)=='M'||Character.toUpperCase(geslacht)=='V'){
            this.geslacht = Character.toUpperCase(geslacht);
        }
        else{
            this.geslacht = 'O';
        }
        
    }
    /**
     * methode om het geslacht van een object van klasse persoon in stringvorm te retourneren
     * @return geslacht String het geslacht van het object van klasse persoon
     */
    public String getGeslacht(){
        switch(this.geslacht){
            case 'M': return "Man";
            case 'V': return "Vrouw";
            }
        return "Onbekend";
    }
    /**
     * methode om de voornaam van een object van klasse persoon te retourneren
     * @return voornaam String de voornaam van het object van klasse persoon
     */
    public String getVoorNaam()
    {
        return voornaam;
    }
    /**
     * methode om de achternaam van een object van klasse persoon te retourneren
     * @return achternaam String de achternaam van het object van klasse persoon
     */
    public String getAchterNaam()
    {
        return achternaam;
    }
    /**
     * methode om het burgerservicenummer van een object van klasse persoon te retourneren
     * @return bsn int het bsn van het object van klasse persoon
     */
    public int getBSN()
    {
        return bsn;
    }
    /**
     * methode om de geboortedatum van een object van klasse persoon te retourneren
     * in het formaat dag/maand/jaar 
     * @return geboortedatum String de voornaam van het object van klasse persoon
     */
    public String getGeboorteDatum() 
    {
        String temp;
        if(dag==0 && maand==0 && jaar==0) 
        {
            temp="Onbekend";
        } 
        else
        {
            temp=dag+"/"+maand+"/"+jaar;
        }
        return temp;
    }
    /**
     * drukt alle info over het object van de klasse persoon af in de console
     */
    public String toString()
    {
    	return "Naam:          "+getAchterNaam()+", "+getVoorNaam()+"\n"
    			+"BSN:           "+getBSN()+"\n"
    			+"Geslacht:      "+getGeslacht()+"\n"
    			+"GeboorteDatum: "+getGeboorteDatum()+"\n";
    }
    /**
     * koppel een persoon aan een dienblad
     */
    public void pakDienblad(Dienblad dienblad) 
    {
        if(!heeftDienblad())
        {
            this.dienblad=dienblad;
        }
    }
    /** 
     * heeft een persoon een dienblad?
     * @return boolean true voor wel, false voor niet
     */
    public boolean heeftDienblad()
    {      
        if(this.dienblad==null)
        {
            return false;
        }
        return true;
    }
    
    public Dienblad getDienblad()
    {
        return dienblad;
    }
    
    /**
     * vergelijk een object met dit object
     * @param  object
     * @return  boolean
     */
    public boolean equals(Object object)
    {
        if(object == this) {
            return true;
        }
        
        if(!(object instanceof Persoon)) {
            return false;
        }

        Persoon cobj = (Persoon) object;

        return (
            cobj.bsn==this.bsn &&
            cobj.voornaam.equals(this.voornaam) &&
            cobj.achternaam.equals(this.achternaam) &&
            cobj.dag == this.dag &&
            cobj.maand == this.maand &&
            cobj.jaar == this.jaar &&
            cobj.geslacht == this.geslacht &&
            cobj.dienblad == this.dienblad
        );
    }
}

