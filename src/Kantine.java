/**
 * info over Kantine zoals:
 * Kassa
 * KassaRij
 * 
 * @author Nick klein en Robert Stocker
 * @version 1.0
 *
 */
public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod aanbod;
    /**
    * Constructor
    */
    public Kantine() 
    {
        kassarij=new KassaRij();
        kassa=new Kassa(kassarij);
    }
    
    /**
     * set de aanbod
     */
    public void setKantineAanbod(KantineAanbod aanbod)
    {
        this.aanbod=aanbod;
    }
    
     /**
     * retourneert het aanbod van de kantine
     */
    public KantineAanbod getKantineAanbod()
    {
        return aanbod;
    }
    
    /**
     * retourneert het kassa object onder het object Kantine 
     */
    public Kassa getKassa()
    {
        return kassa;
    }
    
    /**
    * In deze methode kiest een Persoon met een dienblad
    * de artikelen in artikelnamen.
    * @param persoon
    * @artikelnamen
    */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) 
    {
        for(int i=0;i<artikelnamen.length;i++)
        {
            pakArtikel(persoon,aanbod.getArtikel(artikelnamen[i]));
        }
        kassarij.sluitAchteraan(persoon);
    }
    
    public void pakArtikel(Persoon persoon,Artikel artikel)
    {
       if(persoon.heeftDienblad())
       {
           persoon.getDienblad().getDienbladAsStack().add(artikel);
       } 
    }
    
    /**
    * Deze methode handelt de rij voor de kassa af.
    */
    public void verwerkRijVoorKassa() 
    {
        while(kassarij.erIsEenRij()) 
        {
            Persoon huidigeKlant = kassarij.eerstePersoonInRij();
            kassa.rekenAf(huidigeKlant);
        }
    }
}