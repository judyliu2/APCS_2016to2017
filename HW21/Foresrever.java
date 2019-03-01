//Judy Liu
//APCS1 pd 3
//HW #21: For the Lulz Love of Strings .
//2016-10-24

public class Foresrever{
    
    public static int countDown(int n){
	for(int x = n; x > 0; x -= 1){
	    System.out.println(x);
	}
	return 0; //when x == 0 returns 0
    }

    public static String reverseF(String s){
	int len = s.length(); //length of string
	String revStr="";
	for (int x = len; x > 0; x -= 1){
	    revStr += s.substring(x-1,x); //s.substring(x-1,x) is only 1 letter since (x-1,x) goes up to x but does not include x
	}
	return revStr;
    }

    public static String reverseR(String s){
	int len = s.length();
	String revStr = "";
	if (len==0){
	    return revStr;
	}
	else{
	     if (len > 0){
		 revStr = revStr + s.substring(len-1,len) + reverseR(s.substring(0,len-1));
	     } //if length > 0, add last letter of s and the reverseR of s without its last letter
	}
	return revStr;
    }
    
    public static String fenceF(int posts){
	String fence = ""; 
	if (posts > 0){ //Base case where posts == 1
	    fence = "|";
	}
	for (int x = posts; x > 1; x -= 1  ){
	     fence += "--|";
	}
	return fence;
    }

    
    public static void main(String[] args){
	//System.out.println(countDown(4));
	System.out.println(fenceF(0));
	System.out.println(fenceF(3));
	System.out.println(reverseF("name"));
	System.out.println(reverseR("name"));
	
    }
}
