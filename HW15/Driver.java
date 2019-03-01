public class Driver {
    public static void  main (String [] args) {
	//System.out.println(Stats.mean (3, 5));
	//System.out.println(Stats.mean (4.7, 134.5));
	
	System.out.println(Stats.max (1, 100));
	System.out.println(Stats.max (1, 100.1 ));
	System.out.println(Stats.max (1, 100,200 ));
	System.out.println(Stats.max (45.62, 105.43,20));
	
	System.out.println(Stats.geoMean (9, 5));
	System.out.println(Stats.geoMean (9.6, 5.5));
	System.out.println(Stats.geoMean (3, 9,24));
	System.out.println(Stats.geoMean (9.6, 5.5, 3.1));
    }
}
