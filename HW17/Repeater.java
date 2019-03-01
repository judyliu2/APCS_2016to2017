//Judy Liu
//APCS1 pd3
//HW17: Do I repeat myself? Very well, then I repeat myself
//2016-10-14

public class Repeater{
    static String fenceW(int post){
	String wall="";

	//2 base cases
	if (post<1){
	    return wall;
	}
	if (post==1){
	    wall+="|";
	}
	while (post>1){
	    post-=1;
	    wall=wall+"--|";
	}
	return wall;
    }
    
    static String fenceR(int post){
	
	//2 base cases
	if (post<1){
	    return "";
	}
	if (post==1){
	    return "|";
	}
	
	//recalling the function
	else{
	    return fenceR(post-1)+"--|";
	}
    }

    public static void main(String[] args){
	System.out.println(fenceW(4));
	System.out.println(fenceR(4));
    }
}
