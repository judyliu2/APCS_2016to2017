
public class Driver {
    /* flips until the number of heads is reached.
     * precond: a and b are valid coins, x is positive.
     * postcond: a and b have updated counters, stats are returned. */
    public static String untilHeads(Coin a, Coin b, int x) {
        while ( a.getHeads() + b.getHeads() < x ) {
            a.flip();
            b.flip();
        }
        return "Total: " + ( a.getFlips() + b.getFlips() ) +
            " | Heads: " + ( a.getHeads() + b.getHeads() ) +
            " | Tails: " + ( a.getTails() + b.getTails() );
    }

    /* flips until the number of flips is reached.
     * precond: a and b are valid coins, y is positive.
     * postcond: a and b have updated counters, stats are returned. */
    public static String untilMatches(Coin a, Coin b, int y) {
        while ( a.getFlips() + b.getFlips() < y ) {
            a.flip();
            b.flip();
        }
        return "Total: " + y +
            " | Heads: " + ( a.getHeads() + b.getHeads() ) +
            " | Tails: " + ( a.getTails() + b.getTails() );
    }

    /* flips until total flips > 13 and total flips is divisible by year.
     * precond: a and b are valid coins.
     * postcond: a and b have updated counters, stats are returned. */
    public static String untilMagic(Coin a, Coin b, int year) {
        int totalflips = 0;
        while ( totalflips < 13000 || totalflips % year != 0 ) {
            a.flip();
            b.flip();
            totalflips = a.getFlips() + b.getFlips();
        }
        return "Total: " + totalflips +
            " | Heads: " + ( a.getHeads() + b.getHeads() ) +
            " | Tails: " + ( a.getTails() + b.getTails() );
    }

    public static void main(String[] args) {
        int x = 1000;
        int y = 10000;
        int year = 2000;

        Coin mine = new Coin();
        Coin yours = new Coin( "quarter" );
        Coin wayne = new Coin( "dollar", "heads" );

        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        if ( yours.equals(wayne) )
            System.out.println( "Matchee matchee!" );
        else
            System.out.println( "No match. Firestarter you can not be." );

        Coin a = new Coin();
        Coin b = new Coin();
        System.out.println( untilHeads(a, b, x) );

        Coin c = new Coin();
        Coin d = new Coin();
        System.out.println( untilMatches(c, d, y) );

        Coin e = new Coin();
        Coin f = new Coin();
        System.out.println( untilMagic(e, f, year) );
    }
}

