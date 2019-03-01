//Judy Liu
//APCS1 pd3
//HW15: May ah Hahv S'maur, Please?
//2016-10-07

public class Stats {
    
    public static int mean(int a, int b){
	//returns integer average of 2 integers
	return (a+b)/2;
    }

    public static double mean(double a, double b){
	//returns double average of 2 doubles
	return (a+b)/2;
    }
    
    public static int max(int a, int b){
	//returns the maximum of integer a and integer b
	if (a>b){
	    return a;
		}
	else{
	    return b;
		}
    }

    public static int max(int a, int b, int c){
	//returns maximum of integers a,b,c
	if (a>b && a>c){
	    return a;
	}
	if (b>c && b>a){
	    return b;
	}
	else{
	    return c;
	}
    }
    
    public static double max(double a, double b){
	//returns maximum of double a and double b
	if (a>b){
	    return a;
	}
	else{
	    return b;
	}
    }

    public static double max(double a, double b, double c){
	//returns maximum doubles a,b,c
	if (a>b && a>c){
	    return a;
	}
	if (b>c && b>a){
	    return b;
	}
	else{
	    return c;
	}
    }
    
    public static int geoMean(int a, int b){
	//returns the geometric(floored) mean of integers a and b
	return (int) Math.sqrt(a*b);
    }

    public static int geoMean(int a, int b, int c){
	//returns the geometric(truncated) mean of integers a, b, c
	return (int) Math.pow (a*b*c,1./3); // returns 1 if the exponent does not have a double because exponent has to be double if it's between 0 and 1. If exponent is less than 0, this will always return 0
    }

    public static double geoMean(double a, double b, double c){
	//returns the geometric  mean of doubles a, b, c
	return Math.pow(a*b*c, 1./3); //returns 1 if the exponent does no have a double because exponent has to be a double if it's between 0 and 1
    }
    
    public static double geoMean(double a, double b){
	//returns the geometric mean of doubles a and b, no flooring needed
	return Math.sqrt(a*b);
    }
}
