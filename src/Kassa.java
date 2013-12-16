/**
 * info over Kassa zoals:
 * gescandeArtikelen
 * totaalBedrag
 * 
 * @author Nick klein en Robert Stocker
 * @version 1.0
 *
 */
public class Kassa {
    private int gescandeArtikelen;
    private double totaalBedrag;
    /**
    * Constructor
    */
    public Kassa(KassaRij kassarij) {
        resetKassa();
    }
    /**
    * vraag het aantal artikelen en de totaalprijs op.
    * De implementatie wordt later vervangen
    * door een echte betaling door de persoon.
    * @param persoon die moet afrekenen
    */
    public void rekenAf(Persoon persoon) throws TeWeinigGeldException{
        telOpBijGescandeArtikelen(getAantalArtikelen(persoon));
        telOpbijTotaalPrijs(getTotaalPrijs(persoon));
		persoon.getBetaalWijze().betaal(totaalBedrag);
    }
    
    /**
     * update gescande artikelen.
     * @param artikelen het aantal artikelen dat bij het getal opgeteld moet worden
     * */
    public void telOpBijGescandeArtikelen(int artikelen)
    {
        gescandeArtikelen+=artikelen;
    }
    
    /**
     * update kassawaarde.
     * @param totaalprijs van de nieuwe kassa
     * */
    public void telOpbijTotaalPrijs(double prijs)
    {
        totaalBedrag=prijs+totaalBedrag;
    }
    
    /**
    * Geeft het aantal artikelen dat de kassa
    * heeft gepasseerd,
    * vanaf het moment dat de methode resetWaarden
    * is aangeroepen.
    * @return aantal artikelen
    */
    public int aantalArtikelen() {
        return gescandeArtikelen;
    }
    
    /**
    * Geeft het totaalbedrag van alle artikelen die
    * de kassa zijn gepasseerd, vanaf het moment dat de methode
    *resetKassa
    * is aangeroepen.
    * @return hoeveelheid geld in de kassa
    */
   public double hoeveelheidGeldInKassa(){
       return totaalBedrag;
   }
    
   /**
   * reset de waarden van het aantal gepasseerde artikelen en
   * de totale hoeveelheid geld in de kassa.
   */
   public void resetKassa() {
       gescandeArtikelen=0;
       totaalBedrag=0;
   }
    
   /**
    * Methode om het aantal artikelen op dienblad dat bij de
    * persoon hoort te tellen
    * @return Het aantal artikelen
    */
   public int getAantalArtikelen(Persoon persoon) 
   { 
       if(persoon.heeftDienblad())
       {
           return persoon.getDienblad().getDienbladAsStack().size();
       }
       return 0;
   }
   
   /**
    * Methode om de totaalprijs van de artikelen
    * op dienblad dat bij de persoon hoort uit te rekenen
    * @return De totaalprijs
    */
   public double getTotaalPrijs(Persoon persoon) 
   {
       if(persoon.heeftDienblad())
       {
           double sum = 0;
           for (Artikel artikel : persoon.getDienblad().getDienbladAsStack()) 
           {
                   sum += artikel.getPrijs();
           }
           return sum;
       }
       return 0;
   }
    
}