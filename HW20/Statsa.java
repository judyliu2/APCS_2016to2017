//Team Shorthand -- Haiyao Liu and Shakil Rafi
//APCS1 pd3
//HW14 -- GCD Three Ways
//2016-10-19

public class Stats {

    //gcd methods are near the bottom with the main method 
    
    public static int mean(int a, int b) {
        return (a + b) / 2;
    }
    
    public static double mean(double a, double b) {
        return (a + b) / 2;
    }
    
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else { //return b;
            return b;
        }
    }
    
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else { //return b;
            return b;
        }
    }

    public static int max(int a, int b, int c) {
        if (a > max(b,c)) {
            return a;
        } else {
            return max(b,c);
        }
    }
    
    public static double max(double a, double b, double c) {
        if (a > max(b,c)) {
            return a;
        } else { //return b;
            return max(b,c);
        }
    }

    public static int geoMean(int a, int b) {
        return (int) Math.sqrt(a*b); //return value as an int
    }
    
    public static double geoMean(double a, double b) {
        return Math.sqrt(a*b);
    }

    public static int geoMean(int a, int b, int c) {
        return (int) Math.pow(a*b*c,1.0/3); //return value as an int
    }
    
    public static double geoMean(double a, double b, double c) {
        return Math.pow(a*b*c,1.0/3);
    }

    //start of gcd hw
    
    public static int gcd(int a, int b) {
	int lim = Math.min(a, b);
	int div = 1; // stores largest divisor so far
	int cnt = 1; // counts up to lower input
	
	while (cnt < lim) {
	    if (a % cnt == 0 && b % cnt == 0) {
		div = cnt; 
	    }
	    cnt += 1;
	}
	
	return div;
    }
    
    /*
      Euclid's method:
      To start off, make sure a is greater than b, switching them if needed.
      From there, take the remainder of a / b.
      If it is 0, then a is the gcd.
      Otherwise, retry with b and the remainder of a / b.
      Repeat, replacing a with b and b with the remainder until you reach 0.
      When the remainder ends up as 0, whatever was substituted for a
      at that point is the gcd.
     */
    
    public static int gcdER(int a, int b) {
	if (b>a) {
	    return gcdER(b,a);
	}
	if (b == 0) {
	    return a;
	}
	else {
	    return gcdER(b, a%b);
	}
    }

    public static int gcdEW(int a, int b) {
	if (b > a) { // if b is greater, switch a and b
	    int temp = a;
	    a = b;
	    b = temp;
	}
	
	while (b != 0) { // keep repeating until b == 0
	    int temp = a;
	    a = b;
	    b = temp%b;
	}
	
	return a;
    }

    public static void main(String args[]) {
	System.out.println("------------Brute force----------");	
	System.out.println(gcd(15,20));
	System.out.println(gcd(24,20));
	System.out.println(gcd(250,200));
	System.out.println("------------Euclid method + recursion----------");	
	System.out.println(gcdER(15,20));
	System.out.println(gcdER(24,20));
	System.out.println(gcdER(250,200));
	System.out.println("------------Euclid method + while loop----------");	
	System.out.println(gcdEW(15,20));
	System.out.println(gcdEW(24,20));
	System.out.println(gcdEW(250,200));
    }
}

					      
	    
