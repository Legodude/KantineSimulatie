/*
 * 
 */
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class KantineSimulatie.
 */
public class KantineSimulatie {
	// kantine
    /** The kantine. */
	private Kantine kantine;
    
    // kantineaanbod
    /** The kantineaanbod. */
    private KantineAanbod kantineaanbod;
    
    // random generator
    /** The random. */
    private Random random;
    
    // aantal artikelen
    /** The Constant AANTAL_ARTIKELEN. */
    private static final int AANTAL_ARTIKELEN=4;
    
    // artikelen
    /** The Constant artikelnamen. */
    private static final String[] artikelnamen=
    new String[] {"Koffie","Broodje hamburger", "Broodje kaas", "Melk"};
    
    // prijzen
    /** The artikelprijzen. */
    private static double[] artikelprijzen=
    new double[]{1.51, 2.12, 1.64, 1.78};   
    
    // minimum en maximum aantal artikelen per soort
    /** The Constant MIN_ARTIKELEN_PER_SOORT. */
    private static final int MIN_ARTIKELEN_PER_SOORT=100;
    
    /** The Constant MAX_ARTIKELEN_PER_SOORT. */
    private static final int MAX_ARTIKELEN_PER_SOORT=1000;
    
    // minimum en maximum aantal personen per dag
    /** The Constant MIN_PERSONEN_PER_DAG. */
    private static final int MIN_PERSONEN_PER_DAG=50;
    
    /** The Constant MAX_PERSONEN_PER_DAG. */
    private static final int MAX_PERSONEN_PER_DAG=100;
    
    // minimum en maximum artikelen per persoon
    /** The Constant MIN_ARTIKELEN_PER_PERSOON. */
    private static final int MIN_ARTIKELEN_PER_PERSOON=1;
    
    /** The Constant MAX_ARTIKELEN_PER_PERSOON. */
    private static final int MAX_ARTIKELEN_PER_PERSOON=6;
    
    /** The Constant KANS_STUDENT. */
    private static final double KANS_STUDENT=89;
    
    /** The Constant KANS_DOCENT. */
    private static final double KANS_DOCENT=10;
    
    /** The Constant KANS_MEDEWERKER. */
    private static final double KANS_MEDEWERKER=1;
    
    /**
     * start de kantine simulatie voor x aantal dagen.
     *
     * @param args the arguments
     * @throws TeWeinigGeldException the te weinig geld exception
     */
	public static void main(String[] args) throws TeWeinigGeldException
	{
		int dagen;
		if(args.length==1)
		{
			dagen = Integer.parseInt(args[0]);
		}
		else
		{	
			dagen=50;
		}
		KantineSimulatie sim =  new KantineSimulatie();
		sim.simuleer(dagen);	
	} 
	
    /**
     * Constructor voor kantineSimulator.
     */
    public KantineSimulatie()
    {
        kantine=new Kantine();
        random=new Random();
        int[] hoeveelheden=getRandomArray(AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod=new KantineAanbod(artikelnamen, artikelprijzen, hoeveelheden); 
        kantine.setKantineAanbod(kantineaanbod);
    }
    
    /**
     * Methode om een array van random getallen liggend tussen min en max
     * van de gegeven lengte te genereren.
     *
     * @param lengte the lengte
     * @param min the min
     * @param max the max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) 
    {
        int[] temp=new int[lengte];
        for(int i=0;i<lengte;i++) 
        {
            temp[i]=getRandomValue(min, max);
        }
        return temp;
    }
    
    /**
     * Methode om een random getal tussen min(incl) en
     * max(incl) te genereren.
     *
     * @param min the min
     * @param max the max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) 
    {
        return random.nextInt(max-min+1)+min;
    }
    
    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken.
     *
     * @param indexen the indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) 
    {
        String[] artikelen=new String[indexen.length];
        for(int i=0;i<indexen.length;i++) 
        {
            artikelen[i]=artikelnamen[indexen[i]];
        }   
        return artikelen;
    }
    
    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine.
     *
     * @param dagen the dagen
     * @throws TeWeinigGeldException the te weinig geld exception
     */
    public void simuleer(int dagen) throws TeWeinigGeldException
    {
        for(int i=0;i<dagen;i++) 
        {
            int aantalPersonen = getRandomValue(MIN_PERSONEN_PER_DAG,MAX_PERSONEN_PER_DAG);

            int aantalStudenten = (int) Math.ceil((KANS_STUDENT / 100) * aantalPersonen);
            int aantalDocenten = (int) Math.ceil((KANS_DOCENT / 100)* aantalPersonen);
            int aantalMedewerkers = (int) Math.ceil((KANS_MEDEWERKER /100) * aantalPersonen);

            
            for(int j=0;j<aantalPersonen;j++) 
            {
                Persoon persoon;
                if (j <= aantalMedewerkers)
                {
                    persoon = new KantineMedewerker();
                }
                else if(j > aantalMedewerkers && j <= (aantalDocenten + aantalMedewerkers))
                {
                    persoon = new Docent();
                }
                else if(j > (aantalDocenten + aantalMedewerkers) && j <= (aantalStudenten + aantalDocenten + aantalMedewerkers))
                {
                    persoon = new Student();
                }
                else
                {
                    persoon = new Persoon();
                }
                persoon.pakDienblad(new Dienblad());
                
                int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON,MAX_ARTIKELEN_PER_PERSOON);
                int[] tepakken=getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN-1);
                String[] artikelen=geefArtikelNamen(tepakken);
                kantine.loopPakSluitAan(persoon,artikelen);
                for(int k=0;k<artikelen.length;k++)
                {
                    if(kantineaanbod.getArtikelVoorraad(artikelen[k])<=MIN_ARTIKELEN_PER_SOORT)
                    {
                        kantineaanbod.updateArtikelVoorraad(artikelen[k],MAX_ARTIKELEN_PER_SOORT);
                    }
                }
            }
			kantine.verwerkRijVoorKassa();
            System.out.println("==============================");
            System.out.println("           dag "+(i+1));
            double geld = Math.round(kantine.getKassa().hoeveelheidGeldInKassa() * 100);
            geld = geld/100;
            System.out.println("Totaal omzet van de dag €"+geld);
            System.out.println("Aantal artikelen verkocht:"+kantine.getKassa().aantalArtikelen());
            System.out.println("==============================\n");
            kantine.getKassa().resetKassa();
        }
    }

}