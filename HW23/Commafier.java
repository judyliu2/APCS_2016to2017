//Judy Liu
//APCS1 pd3
//HW23: Karmacomma
//2016-10-26

public class Commafier{

    /*=====================================
      String commafyR(int) -- inserts commas in a number, every 3rd digit,
      recursively.
      precondition:  n is non-negative integer
      postcondition: returns String version of n with commas inserted
      =====================================*/
    
    public static String commafyR(int n){
	String intStr = Integer.toString(n);
	int len = intStr.length();
	String retStr = "";
	if (len <=3){
	    return intStr;
	}
	else{
	     retStr = retStr+
		    commafyR(Integer.parseInt(intStr.substring(0,len-3)))+
		    //adds last 3 numbers and comma to commafyR(int of number without the last 3 digits)
		    "," +
		    intStr.substring(len-3,len);
	}
	return retStr;
    }

   /*=====================================
      String commafyF(int) -- inserts commas in a number, every 3rd digit,
      using a FOR Loop.
      precondition:  n is non-negative integer
      postcondition: returns String version of n with commas inserted
      =====================================*/ 

    public static String commafyF(int n){
	String intStr = Integer.toString(n);
	int len = intStr.length();
	String retStr = "";
	String fewDig = "";
	if (len <= 3){
	    retStr=intStr;
	}
	for(int x = len; x>3; x-=3){//This gives all digits but the first 1~3 digits before the comma
	    retStr= "," + intStr.substring(x-3,x)+ retStr;
	}
	//appendss first 1~3 numbers to the string
	if (len%3!=0 && len>3){ 
	    retStr=intStr.substring(0,len%3)+retStr;
	}
	if (len%3==0 &&len > 3){
	    retStr=intStr.substring(0,3)+retStr;
	}
	return retStr;
	
    }
    public static void main(String[] args){
	  //test calls for development:
	System.out.println( "commafyR(1): " + commafyR(1) ); 
	System.out.println( "commafyR(10): " + commafyR(10) ); 
	System.out.println( "commafyR(101): " + commafyR(101) ); 
	System.out.println( "commafyR(1000): " + commafyR(1000) );
	System.out.println( "commafyR(12345): " + commafyR(12345) ); 
	System.out.println( "commafyR(1234567890): " + commafyR(1234567890) );

	System.out.println( "commafyF(1): " + commafyF(1) ); 
	System.out.println( "commafyF(10): " + commafyF(10) ); 
	System.out.println( "commafyF(101): " + commafyF(101) ); 
	System.out.println( "commafyF(1000): " + commafyF(1000) ); 
	System.out.println( "commafyF(12345): " + commafyF(12345) ); 
	System.out.println( "commafyF(1234567890): " + commafyF(1234567890) );

	//code to handle command line input: 
	for( String intAsStr : args ) {
	    System.out.println( commafyF( Integer.parseInt(intAsStr )));
	}
	//or
	for( String intAsStr : args ) {
	    System.out.println( commafyR( Integer.parseInt(intAsStr )) );
	}

    }
}
