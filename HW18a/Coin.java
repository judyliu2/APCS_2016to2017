/* Jeffrey Lin
 * APCS1 period 01
 * HW18 -- Loopy
 * 2016-10-17
 */

public class Coin {
    private int value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private float bias;

    // default constructor
    public Coin() {
        assignValue();
        bias = (float) Math.random();
    }

    // overloaded constructor takes denomination as String
    public Coin(String denom) {
        this();
        name = denom;
        assignValue();
    }

    // overloaded constructor takes denomination and current face as Strings
    public Coin(String denom, String face) {
        this();
        name = denom;
        upFace = face;
        assignValue();
    }

    // accessors
    public int getHeads() {
        return headsCtr;
    }

    public int getTails() {
        return tailsCtr;
    }

    public int getFlips() {
        return flipCtr;
    }

    // simulate a coin flip. Returns String with probability of getting heads determined by bias.
    public String flip() {
        if ( Math.random() >= bias ) {
            headsCtr += 1;
            upFace = "heads";
        }
        else {
            tailsCtr += 1;
            upFace = "tails";
        }
        flipCtr += 1;
        return upFace;
    }

    // override toString method to return the coin's denomination and face value
    @Override
    public String toString() {
        // return name + " " + upFace;
        String str = name + " " + upFace;
        return str;
    }

    // compare this coin to another. Returns true if they have the same face, false otherwise.
    public boolean equals(Coin c) {
        return upFace.equals(c.upFace);
    }

    // assigns each coin a monetary value according to its name
    public int assignValue() {
        if ( name == "penny" )   { value = 1; }
        if ( name == "nickel" )  { value = 5; }
        if ( name == "dime" )    { value = 10; }
        if ( name == "quarter" ) { value = 25; }
        if ( name == "dollar" )  { value = 100; }
        return value;
    }

    // simulate 1 billion coin flips
    public static void main(String[] args) {
        Coin Test = new Coin();
        while ( Test.flipCtr < 1000000000 ) {
            Test.flip();
        }
        System.out.println("heads: " + Test.headsCtr + " | tails: " + Test.tailsCtr + " | total: " + Test.flipCtr);
    }
}

