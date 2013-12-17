// TODO: Auto-generated Javadoc
/**
 * info over Kantine zoals:
 * Kassa
 * KassaRij.
 *
 * @author Nick klein en Robert Stocker
 * @version 1.0
 */
public class Kantine {
    
    /** The kassa. */
    private Kassa kassa;
    
    /** The kassarij. */
    private KassaRij kassarij;
    
    /** The aanbod. */
    private KantineAanbod aanbod;
    
    /**
     * Constructor.
     */
    public Kantine() 
    {
        kassarij=new KassaRij();
        kassa=new Kassa(kassarij);
    }
    
    /**
     * set de aanbod.
     *
     * @param aanbod the new kantine aanbod
     */
    public void setKantineAanbod(KantineAanbod aanbod)
    {
        this.aanbod=aanbod;
    }
    
     /**
      * retourneert het aanbod van de kantine.
      *
      * @return the kantine aanbod
      */
    public KantineAanbod getKantineAanbod()
    {
        return aanbod;
    }
    
    /**
     * retourneert het kassa object onder het object Kantine.
     *
     * @return the kassa
     */
    public Kassa getKassa()
    {
        return kassa;
    }
    
    /**
     * In deze methode kiest een Persoon met een dienblad
     * de artikelen in artikelnamen.
     *
     * @param persoon the persoon
     * @param artikelnamen the artikelnamen
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
    
    /**
     * pak artikel.
     *
     * @param persoon the persoon
     * @param artikel the artikel
     */
    public void pakArtikel(Persoon persoon,Artikel artikel)
    {
       if(persoon.heeftDienblad())
       {
           persoon.getDienblad().getDienbladAsStack().add(artikel);
       } 
    }
    
    /**
     * Deze methode handelt de rij voor de kassa af.
     *
     * @throws TeWeinigGeldException the te weinig geld exception
     */
    public void verwerkRijVoorKassa() throws TeWeinigGeldException
    {
        while(kassarij.erIsEenRij()) 
        {
            Persoon huidigeKlant = kassarij.eerstePersoonInRij();
            kassa.rekenAf(huidigeKlant);
        }
    }
}