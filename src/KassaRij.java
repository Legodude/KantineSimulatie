/**
 * info over KassaRij zoals:
 * LinkedList persoon
 * 
 * @author Nick klein en Robert Stocker
 * @version 1.0
 *
 */
import java.util.LinkedList;
public class KassaRij {
    private LinkedList<Persoon> personen;
    
    /**
    * Constructor voor de objecten van klasse KassaRij
    */
    public KassaRij() {
        personen = new LinkedList<Persoon>();
    }
    
    /**
    * Persoon sluit achter in de rij aan
    * @param persoon
    */
    public void sluitAchteraan(Persoon persoon) {
        personen.add(persoon);
    }
    
    /**
    * Indien er een rij bestaat, de eerste Persoon uit
    * de rij verwijderen en retourneren.
    * Als er niemand in de rij staat geeft deze null terug.
    * @return Eerste persoon in de rij of null
    */
    public Persoon eerstePersoonInRij() {
        return personen.remove(0);
    }
    
    /**
    * Methode kijkt of er personen in de rij staan.
    * @return Of er wel of geen rij bestaat
    */
    public boolean erIsEenRij() 
    {
        return !personen.isEmpty();
    }
}