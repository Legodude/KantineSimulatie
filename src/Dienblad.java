/**
 * info over Dienblad zoals:
 * artikelen
 * 
 * @author Nick klein en Robert Stocker
 * @version 1.0
 *
 */

import java.util.Stack;
public class Dienblad {
    private Stack<Artikel> artikelen;
    
    /**
    * Constructor
    */
    public Dienblad() {
        artikelen = new Stack<Artikel>();
    }
    /**
     * retourneert een Stack van type Artikel van dit dienblad.
     */    
    public Stack<Artikel> getDienbladAsStack()
    {
        return artikelen;
    }
}