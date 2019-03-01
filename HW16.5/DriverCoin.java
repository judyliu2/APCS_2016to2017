/*=============================
  driver for class Coin -- v1
  by Clyde "Thluffy" Sinclair

  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Cut&paste the "TOP" line below the first statement. 
     (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM

  NOTE: Repeated execution should yield different results.
  =============================*/

public class DriverCoin {
 
    public static void main( String[] args ) {

	//build Objects from blueprint specified by class Coin

	//===================TOP==========================
	//test default constructor
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

	//test matches method
	yours.matches(wayne, 2);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);


    }//end main

}//end class
