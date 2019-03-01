//Judy Liu
//APCS1 pd3
//HW16 Wayne's World
//2016-10-13

public class Coin {
    
    private double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;
    private int numMatches;

    public Coin(){

	//instance var
	value=0.0;
	upFace="heads";
	name="null";
	flipCtr=0;
	headsCtr=0;
	tailsCtr=0;
	bias=0.5;
    }
    
    //takes String to indicate denom 
    public Coin(String denoms){
	this();
	name=denoms;
    }

    //takes String input to indicate denom and other string to indicate face
    public Coin(String denoms, String face){
	this();
	name=denoms;
	upFace=face;
    }

    //overrided toString()
    public String toString(){
	String retStr="\n Info:\n ============================";
	retStr= retStr+"\n Name: "+name;
	retStr= retStr+"\n Value: "+value;
	retStr= retStr+"\n Face: "+upFace;
	retStr= retStr+"\n flipCtr: "+flipCtr;
	retStr= retStr+"\n headsCtr: "+headsCtr;
	retStr= retStr+"\n tailsCtr: "+tailsCtr;
	retStr= retStr+"\n bias: "+bias;
	retStr= retStr+"\n Number of Matches: "+numMatches+"\n\n";
	return retStr;
    }

    //flips coin
    public String flip(){
	if (bias>Math.random()){
	    upFace="heads";
	    headsCtr+=1;
	}
	else{
	    upFace="tails";
	    tailsCtr+=1;
	}
	flipCtr+=1;
	return upFace;
    }
   
    //needs a getter for upFace because upFace is a private instance var
    public String getUpFace(){
	return this.upFace;
    }
    
    //Coin is the type because other is an object from class Coin
    public boolean equals(Coin other){
	String a=this.upFace;
	String b=other.getUpFace();
	return a.equals(b);
	//	return (this.upFace == other.getUpFace());
	
    }
    
    //Matches coins and counts matches
    public int matches(Coin other, int x){
	while (numMatches<x){
	    String a=this.upFace;
	    String b=other.getUpFace();
	    this.flip();
	    other.flip();
	    if (a.equals(b)){
	    // if (this.upFace.equals(other.getUpFace())){
		numMatches+=1;
		other.numMatches+=1;
	    }
	}
	return numMatches;
    }

    //sets coin values based on name
    public void assignValue(){
	if (name=="null"){
	    value=0.0;
	}
	if (name=="penny"){
	    value=0.01;
	}
	if (name=="nickel"){
	    value=0.05;
	}
	if (name=="dime"){
	    value=.1;
	}
	if (name=="quarter"){
	    value=.25;
	}
	if (name=="dollar"){
	    value=1.;
	}

    }
 
}
