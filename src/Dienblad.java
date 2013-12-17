/**
 * info over Dienblad zoals:
 * artikelen
 * 
 * @author Nick klein en Robert Stocker
 * @version 1.0
 *
 */

import java.util.Stack;
// TODO: Auto-generated Javadoc

/**
 * The Class Dienblad.
 */
public class Dienblad {
    
    /** The artikelen. */
    private Stack<Artikel> artikelen;
    
    /**
     * Constructor.
     */
    public Dienblad() {
        artikelen = new Stack<Artikel>();
    }
    
    /**
     * retourneert een Stack van type Artikel van dit dienblad.
     *
     * @return the dienblad as stack
     */    
    public Stack<Artikel> getDienbladAsStack()
    {
        return artikelen;
    }
}