public class Administratie {
    
    private static final int DAYS_IN_WEEK = 7;
    
    private Administratie()
    {
        
    }
    /**
    * Deze methode berekent van de int array aantal de
    * gemiddelde waarde
    * @param aantal
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
    * gemiddelde waarde
    * @param omzet
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
     * deze methode berekent de dag omzet door middel van het optellen van de opeenvolgende zelfde dagen
     * 
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