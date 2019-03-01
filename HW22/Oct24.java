//Judy Liu
//APCS1 pd3
//HW#22: Yo Dog, I Heard You Like Loops...
//2016-10-25



public class Oct24{
    
    public static String doubleChar(String str){
	String newStr="";
	for (int x = 0; x < str.length() ; x += 1){
	    newStr= newStr + str.substring(x, x+1) +str.substring(x,x+1);
	     }
	return newStr;
    }

    public static int countHi(String str){
	int len = str.length();
	int ctr = 0;
	for (int x = 0; x + 2 <= len ; x += 1){
	    if (str.substring(x,x+2).equals("hi")){
		ctr+=1;
	    }
	}
	return ctr;
    }

    public static boolean catDog(String str){
	int len = str.length();
	int catCtr = 0;
	int dogCtr = 0;
	for (int x = 0; x + 3 <= len; x+=1){
	    if (str.substring(x, x+3).equals("cat")){
		catCtr+=1;
	    }
	    if (str.substring(x, x+3).equals("dog")){
		dogCtr+=1;
	    }
	}
	return catCtr==dogCtr;
    }

    public static int countCode(String str){
	int len = str.length();
	int ctr = 0;
	for (int x = 0; x+4 <=len; x+=1){
	    if (str.substring(x,x+2).equals("co") &&
		str.substring(x+3,x+4).equals("e")){
		ctr+=1;
	    }
	}
	return ctr;
    }

    public static boolean endOther(String a, String b){
	int lena = a.length();
	int lenb = b.length();
	int smol = Math.min(lena,lenb);
	return a.substring(lena-smol,lena).toLowerCase().equals(
	     b.substring(lenb-smol,lenb).toLowerCase());
    }
		
    public static boolean xyzThere(String str){
	int len = str.length();
	if (len<3){
	    return false;
	}
	if (str.substring(0,3).equals("xyz")){
	    return true;
	}
	else{
	for (int x = 1; x+3 <=len ; x+=1){
	    if (str.substring(x,x+3).equals("xyz")
		&& ! str.substring(x-1,x).equals(".")
		){
		return true;
	    }
	}
	}
	return false;
    }
    
    public static void main(String[] args){
	System.out.println(xyzThere("abc.xyz"));
	System.out.println(xyzThere("abcxyz"));
    }
}
