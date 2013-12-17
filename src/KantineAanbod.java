/*
 * 
 */
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class KantineAanbod.
 */
public class KantineAanbod {
    // interne opslag voorraad
    /** The aanbod. */
    private HashMap<String, ArrayList<Artikel>> aanbod;
   
    
    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     *
     * @param artikelnaam the artikelnaam
     * @param prijs the prijs
     * @param hoeveelheid the hoeveelheid
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid) {
        aanbod=new HashMap<String, ArrayList<Artikel>>();
        for(int i=0;i<artikelnaam.length;i++) 
        {
            ArrayList<Artikel> artikelen=new ArrayList<Artikel>();
            for(int j=0;j<hoeveelheid[i];j++) 
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            aanbod.put(artikelnaam[i], artikelen);
        }
    }
  
    /**
     * Private methode om de lijst van artikelen te krijgen op basis van de
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     *
     * @param productnaam the productnaam
     * @return the array list
     */
    private ArrayList<Artikel> getArrayList(String productnaam) {
         return aanbod.get(productnaam); 
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken.
     * Retourneert null als de stapel leeg is.
     *
     * @param stapel the stapel
     * @return the artikel
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel) {
        if (stapel==null) { 
            return null;
        }
        if (stapel.size()==0)
        {
           return null;
        }
        else 
        {
            Artikel a=stapel.get(0);
            stapel.remove(0);
            return a;
        }
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel (of null)
     */
    public Artikel getArtikel(String naam) {
        return getArtikel(getArrayList(naam));
    }    
    
    /**
     * update de artikelvoorraad.
     *
     * @param naam the naam
     * @param voorraad the voorraad
     */
    public void updateArtikelVoorraad(String naam, int voorraad)
    {
        double prijs =  getArtikel(naam).getPrijs();
        ArrayList<Artikel> artikelen=new ArrayList<Artikel>();
        int toRefill = voorraad-getArtikelVoorraad(naam);
        for(int i= 0 ; i < toRefill; i++) {
            artikelen.add(new Artikel(naam, prijs));
        }
        aanbod.put(naam , artikelen);
        System.out.println("###########################");
        System.out.println(naam);
        System.out.println("naar "+voorraad+" bijgevuld");
        System.out.println("###########################");
        System.out.println("");
    }
    
    /**
     * vraag de artikelvoorraad op.
     *
     * @param naam the naam
     * @return voorraad
     */
    public int getArtikelVoorraad(String naam)
    {
            return getArrayList(naam).size();
    }
}