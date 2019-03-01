// Judy Liu
// APCS1 pd3
//HW20: GCD Three Ways
//2016-10-18
//Group Clippies: Maria, Judy

public class Stats{

    public static int gcd(int a, int b){
	int trial = 1;
	int cd = 1;
	//2 base cases
	if (a%b == 0){
	    cd = b;
	}
	else if (b%a == 0){
	    cd = a;
	}
	else{
	    if (a>b){
		while (trial <b){ //while checks for any factors under lower int
		    if (a%trial == 0 && b%trial == 0){
			cd=trial;
		    }
		    trial += 1;
		}
	    }
	    else{
		while (trial <a){
		    if (a%trial == 0 && b%trial == 0){
			cd=trial;
		    }
		    trial += 1;
		}
	    }
	}
	return cd;	
    }
    
    //Euclid's algorithm recusively
    public static int gcdER(int a, int b){
	int cd = 1;
	//2 base cases
	if (a%b == 0 ){
	    cd = b;
	}
	else if (b%a == 0){
	    cd = a;
	}
	else{
	    //recursive calls
	    if (a > b){
		cd = gcdER( b, a%b); //lower int is divided by remainder of hight int and itself
	    }
	    else{
		cd = gcdER( a, b%a);
	    }
	}
	return cd;
    }
    
    //Euclid's algorithm iteratively with a while loop
    public static int gcdEW(int a,int b){
	int cd = 1;
	int factorCtr = 0;
	int remainder = 0;
	//2 base cases
	if (a%b == 0){
	    cd = b;
	    factorCtr += 1;
	}
	else if (b%a == 0){
	    cd = a;
	    factorCtr += 1;
	}
        else{
	    //while loop
	    while(factorCtr < 1){//for every 2 integers, there is atleast 1 factor (1)
		if(a > b){
		    remainder = a%b;
		    if (b%remainder == 0){
			cd = remainder;
			factorCtr += 1;
		    }
		}
		else{
		    remainder = b%a;
		    if (a%remainder == 0){
			cd = remainder;
			factorCtr +=1 ;
		    }
		}
	    }
	
	}
	return cd;
    }
    public static void main(String[] args){
	//Testing gcd
	System.out.println("gcd:");
	System.out.println(gcd(9,3));
      	System.out.println(gcd(3,13));
	System.out.println(gcd(75,100));
	System.out.println(gcd(100,75));

	//Testing gcdER
	System.out.println("gcdER:");
	System.out.println(gcdER(9,3));
      	System.out.println(gcdER(3,13));
	System.out.println(gcdER(75,100));
	System.out.println(gcdER(100,75));

	//Testing gcdEW
	System.out.println("gcdEW:");
	System.out.println(gcdEW(9,3));
      	System.out.println(gcdEW(3,13));
	System.out.println(gcdEW(100,75));
	System.out.println(gcdEW(75,100));
    }
}
