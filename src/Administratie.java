// TODO: Auto-generated Javadoc
/**
 * Met deze panel worden berekeningen gedaan.
 * @author Robert Stocker & Nick Klein
 *
 */
public class Administratie {
    
    /** The Constant DAYS_IN_WEEK. */
    private static final int DAYS_IN_WEEK = 7;
    
    /**
     * constructor, leeg en privatge zodat hij niet aangeroepen kan worden.
     */
    private Administratie()
    {
        
    }
    
    /**
     * Deze methode berekent van de int array aantal de
     * gemiddelde waarde.
     *
     * @param aantal the aantal
     * @return het gemiddelde
     */
    public static double berekenGemiddeldAantal(int[] aantal) 
    {
        int sum=0;
        for(int i=0;i<aantal.length;i++)
        {
            sum+=aantal[i];
        }
        return (double)sum/aantal.length;
    }
    
    /**
     * Deze methode berekent van de double array omzet de
     * gemiddelde waarde.
     *
     * @param omzet the omzet
     * @return Het gemiddelde
     */
    public static double berekenGemiddeldeOmzet(double[] omzet) 
    {
        double sum=0;
        for(int i=0;i<omzet.length;i++)
        {
            sum+=omzet[i];
        }
        return (double)sum/omzet.length;
    }
    
    /**
     * deze methode berekent de dag omzet door middel van het optellen van de opeenvolgende zelfde dagen.
     *
     * @param omzet the omzet
     * @return the double[]
     */
    public static double[] berekenDagOmzet(double[] omzet)
    {
        double[] temp=new double[DAYS_IN_WEEK];
        for(int i=0;i<DAYS_IN_WEEK;i++)
        {
            int j=0;
            while((i+DAYS_IN_WEEK*j) < omzet.length)
            {
                temp[i]+=omzet[i+DAYS_IN_WEEK*j];
                j++;
            }
        }
        return temp;
    }
}