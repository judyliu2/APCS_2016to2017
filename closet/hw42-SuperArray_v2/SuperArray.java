//Judy Liu
//APCS pd 3
//HW42 -- Array of Grade 316
//2016-12-08

/*==================================================
  class SuperArray version 2.0
  Wrapper class for array. Facilitates resizing, 
  expansion, and read/write capability on elements.
  ==================================================*/

public class SuperArray 
{
    private int[] _data;  //underlying container structure
    private int _lastPos; //marker for last meaningful value
    private int _size;    //number of meaingful values

    //default constructor
    //initializes 10-item array
    public SuperArray() {
	_data = new int[10];
	//upon creation, there are no meaningful values
	_lastPos = -1;
	_size = 0;
    }

    //output array in [a,b,c] format
    //eg, for int[] a = {1,2,3} ...
    //toString() -> "[1,2,3]"
    public String toString() {
	String retstr = "[";
	//add each element with a comma
	for (int i : _data) retstr += i + ",";
	//if there is at least one element
	//remove last comma 
	if (!retstr.equals("["))
	    retstr = retstr.substring(0, retstr.length() - 1);
	retstr += "]";
	return retstr;
    }

    //double capacity of this instance of SuperArray 
    private void expand() {
	int[] newarr = new int[_data.length * 2];
	for (int i = 0; i < _data.length; i++)
	    newarr[i] = _data[i];
	_data = newarr;
    }

    //accessor method -- return value at specified index
    public int get( int index ){
	return _data[index];
    }

    //mutator method -- set index to newVal, return old value at index
    public int set( int index, int newVal ) {
	int old = _data[index];
	_data[index] = newVal;
	return old;
    }


    //adds an item after the last item
    public void add( int newVal ) {
	int[] newarr = new int[_data.length + 1];
	for (int i = 0; i < _data.length; i++)
	    newarr[i] = _data[i];
	
	newarr[_data.length] = newVal;
	_data = newarr;
	_size +=1;
    }

    //inserts an item at index
    //shifts existing elements to the right
    public void add( int index, int newVal ) {
	int[] newarr = new int[_data.length + 1];
	for (int i = 0; i < index; i++)
	    newarr[i] = _data[i];
	
	newarr[index] = newVal;
	
	for (int i = index + 1; i < newarr.length; i++)
	    newarr[i] = _data[i - 1];
	
	_data = newarr;
	_size +=1;
    }

    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public void remove( int index ) {
	int[] newarr = new int[_data.length -1];
	for ( int i = 0; i< index; i++)
	    newarr[i] = _data[i];
	for (int i = index + 1; i< newarr.length + 1; i++)
	    newarr[i -1] = _data[i];
	_data = newarr;
	_size -=1;
    }

    //return number of meaningful items in _data
    public int size() {
	return _size;
    }


    //main method for testing
    public static void main( String[] args ) 
    {
	/*===========================================
	SuperArray curtis = new SuperArray();
	System.out.println("Printing empty SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set(i,i*2);
	    curtis._size++;
	}

	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(curtis);

	SuperArray mayfield = new SuperArray();
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

	mayfield.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	  ===========================================*/
    }//end main()

}//end class SuperArray
