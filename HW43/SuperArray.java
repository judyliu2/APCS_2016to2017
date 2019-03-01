//Team Titanium: Augie Murphy, Judy Liu
// APCS1 pd03
// HW#43 -- Array of Titanium
// 2016-12-11

/***********************************************
  class SuperArray version 1.0
  -- wrapper class for array --
  -- facilitates resizing, expansion, 
  and read/write capabilities on elements. --
 **********************************************/

public class SuperArray implements ListInt
{
    private int[] _data;  //underlying container structure
    private int _lastPos; //marker for last meaningful value
    private int _size;    //number of meaningful values

    /***DEFAULT CONSTRUCTOR***
    Initializes a 10-item array
    **************************/
    public SuperArray() 
    { 
        _data = new int[10];
	_lastPos = -1;
	_size = 0;
    }

    /****** toString() ******
    Returns a string representation of the array
    -- formatting: begins w/ "[", ends with "]", commas separate elements. --
    **************************/
    public String toString() 
    {
	String retStr = "[" + get( 0 ); //format stuffs
	for( int x = 1; x < _data.length; x++ ){
	    retStr += "," + get( x );
	} 
       	return retStr + "]";
    }
    /******* expand() *******
    double capacity of this instance of SuperArray 
    **************************/
    private void expand() 
    {
	int[] _expandIt = new int[ _data.length * 2 ];
        for( int x = 0; x < _data.length; x++ ){
	    _expandIt[x] = _data[x];
	}
	_data = _expandIt;
    }
    /******** get() **********
    accessor method -- return value at specified index
    **************************/
    public int get( int index ) 
    {
	return _data[ index ];
    } 

    /******** set() **********
    mutator method -- set index to newVal, return old value at index
    **************************/
    public int set( int index, int newVal ) 
    {
	int oldVal = _data[ index ];
	_data[ index ] = newVal;
	return oldVal;
    }

   /********* add() ***********
    adds newVal param after last significant value
    **************************/
    public void add(int newVal){
	if( _lastPos < -1 ){ _data[_lastPos + 1] = newVal; }
	else{ add( _lastPos + 1, newVal ); }
    }

   /******** add() ***********
    adds newVal param at index param
    **************************/
    public void add(int index, int newVal){
        expand();
	for (int x = _lastPos; x >= index; x--){
	    _data[x] = _data[x + 1];
	}
	_data[ index ] = newVal;
	_size += 1;
	_lastPos += 1;
    }

   /******* remove() *********
    removes val at index param and scooches the values greater than the index over one
    **************************/
    public void remove( int index ){
	for( int x = index; x < _data.length - 1; x++ ){
	    _data[x] = _data[x + 1];
	}
        _lastPos -= 1;
	_size -= 1;
    }
    
    /******** size() *********
    accesses inst var _size aka number of sig vals
    **************************/
    public int size(){
	return _size;
    }

    //main method for testing
    public static void main( String[] args ) 
    {
	/*When using methods from SuperArray, curtis has to be typecasted since
	it is a ListInt */
	  ListInt curtis = new SuperArray();
	  System.out.println( "\nPrinting empty SuperArray curtis..." );
	  System.out.println( curtis );

	  for( int i = 0; i < ((SuperArray)curtis)._data.length; i++ ) {
	      ((SuperArray)curtis).set( i, i * 2 );
	  }

	  System.out.println("\nPrinting populated SuperArray curtis...");
	  System.out.println(curtis);
	  
	  for( int i = 0; i < 3; i++ ) {
	      ((SuperArray)curtis).expand();
	  System.out.println("\nPrinting expanded SuperArray curtis...");
	  System.out.println(curtis);
	  System.out.println("new length of underlying array: " 
			     + ((SuperArray)curtis)._data.length );
	  }


	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(curtis);

	ListInt mayfield = new SuperArray();
	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.add(5);
	mayfield.add(4);
	mayfield.add(3);
	mayfield.add(2);
	mayfield.add(1);

	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);
	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);


    }//end main()

}//end class SuperArray

