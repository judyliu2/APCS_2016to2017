//Judy Liu
//APCS1 pd3
//HW14: stAtistically sPeaking
//2016-10-06

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
    
    public static double max(double a, double b){
	//returns maximum of double a and double b
	if (a>b){
	    return a;
	}
	else{
	    return b;
	}
    }
    public static int geoMean(int a, int b){
	//returns the geometric(floored) mean of integers a and b
	return (int) Math.sqrt(a*b);
    }
    
    public static double geoMean(double a, double b){
	//returns the geometric mean of doubles a and b, no flooring needed
	return Math.sqrt(a*b);
    }
    
    public static void main(String[] args){//testing results
	System.out.println(mean(4,2));
	System.out.println(mean(2.4,4.2));
	System.out.println(max(8,6));
	System.out.println(max(86.45,100.3));
	System.out.println(geoMean(12,5));
	System.out.println(geoMean(12.4,43.52));
	System.out.print((int)-1.8);//ceils negative numbers, floors postive numbers
    }
}
