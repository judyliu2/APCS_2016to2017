//Judy Liu
//APCS1 pd3
//HW18 Loopy
//2016-10-17

public class Driver{
    static Coin dog = new Coin("dime");
    static Coin cat = new Coin("penny");
    public static int matchHeads(int x){
	//HeadsCtr
	Coin other = new Coin();
	String a=dog.getUpFace();
	String b=cat.getUpFace();
	int c=cat.getHeadsCtr();
	int d=dog.getHeadsCtr();
	//heads counter
    	while (c+d<x){
	    dog.flip();
	    cat.flip();
	    if (a.equals("heads")){
		d+=1;
	    }
	    if (b.equals("heads")){
		c+=1;
	    }
	}
	return c+d;
    }
   
	//Match counter
    public static int match(int y){
	
	int matchCtr=0;
	String a=dog.getUpFace();
	String b=cat.getUpFace();
	while (matchCtr<y){
	    dog.flip();
	    cat.flip();
	    if (a.equals(b)){
		matchCtr+=1;
	    }
	}
	return matchCtr;
    }

    public static int match2(int z){
	int numMatch=0;
	String a=dog.getUpFace();
	String b=cat.getUpFace();
	if (z<13000 || 2000%z!=0){
	    while (numMatch<z){
		dog.flip();
		cat.flip();
		if (a.equals(b)){
		    numMatch+=1;
		}
	    }
	}
	return numMatch;
    }
    public static void main(String[] args){

	System.out.println("dog: "+ dog);
	System.out.println("cat: "+ cat);
	//	System.out.println(match(4));
	//	System.out.println(matchHeads(10));
	System.out.println(match2(4000));
    }
}
