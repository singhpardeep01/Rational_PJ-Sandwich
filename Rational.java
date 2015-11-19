// Team PJ-Sandwich -- James Wang, Pardeep Singh
// APCS1 pd9
// HW33 -- Do You Even Add, Bro?
// 2015-11-18

public class Rational {

	// instance vars
	private int numerator;
	private int denominator;

	// default constructor
	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	// constructor
	public Rational(int numerator, int denominator) {
		this();
		if (denominator != 0) {
			this.denominator = denominator;
			this.numerator = numerator;
		}
		else {
			System.out.println("Invalid denominator");
		}
	}

	// overriding toString()
	public String toString() {
		return numerator + "/" + denominator;
	}

	// returns a floating point value of the number
	public double floatValue() {
		return (double) numerator / denominator;
	}

	// takes 1 Rational object as a parameter and multiplies it by this Rational object, modifies this object
	public void multiply(Rational r) {
		numerator = numerator * r.numerator;
		denominator = denominator * r.denominator;
	}

	// takes 1 Rational object as a parameter and divides it by this Rational object, modifies this object
	public void divide(Rational r) {
	    numerator = numerator * r.denominator;
	    denominator = denominator * r.numerator;
	}


	public void add(Rational r) {
	    int g = new Rational(denominator, r.denominator).gcd();
	    denominator *= r.denominator / g;
	    numerator *= r.denominator / g;
	    numerator += (r.numerator * (denominator / r.denominator));
	}

        public void subtract(Rational r) {
	    int g = new Rational(denominator, r.denominator).gcd();
            denominator *= r.denominator / g;
            numerator *= r.denominator / g;
            numerator -= (r.numerator * (denominator / r.denominator));
	}
        public int gcd() {
	    int a = numerator;
	    int b = denominator;
	    
	    int theGcd = 1;
	    
	    if (a>b) {
		if (a%b==0) { //done, yay!
		    theGcd = b;
		}
		else { //implement algorithm
		    a -= b;
		    theGcd = new Rational(a,b).gcd();
		}
	    }
	    
	    else {
		theGcd = new Rational(b,a).gcd(); //instead of rewriting code, switch maxes
	    }
	    return theGcd;
	}
  
        public void reduce() {
	    int g = gcd();
	    numerator /= g;
	    denominator/= g;
	}

	    
        public static int gcd(int numerator, int denominator) {
            if (denominator == 0) {
                return numerator;
            }
            return gcd(denominator, numerator % denominator);
        }

        public int compareTo(Rational r) {
	    double calling = numerator / (denominator + 0.0);
	    double parameter = r.numerator / (r.denominator + 0.0);

	    if ( calling == parameter ) {
		return 0;
	    }
	    else if ( calling > parameter ) {
		return 1;
	    }
	    else {
		return -1;
	    }
	}
	   
	// main method for testing
	public static void main(String[] args) {
		Rational r = new Rational(2, 3); // Stores the rational number 2/3
		Rational s = new Rational(1, 2); // Stores the rational number 1/2
		Rational t = new Rational(2, 4); // Stores the rational number 1/2
		Rational u = new Rational(5, 3); // Stores the rational number 1/2
		Rational v = new Rational(6, 1); // Stores the rational number 1/2
		System.out.println( s.compareTo(t) );
		System.out.println( v.compareTo(u) );
		System.out.println( r.compareTo(u) );
		//r.add(s);
		// System.out.println(r);
		// r.subtract(s);
		// System.out.println(r);
		// r.multiply(s); // Multiplies r by s, changes r to 2/6.  s remains 1/2
                // r.reduce();
		// System.out.println(r.toString());
		// System.out.println(r.floatValue());
		// r.divide(s); // Divides r by s, changes r to 2/3.  s remains 1/2
		// System.out.println(r.toString());
		// System.out.println(r.floatValue());
		// Rational q = new Rational(); // tests default constructor
		// System.out.println(q.toString());
		// Rational x = new Rational(1, 0); // tests constructor, 0 as denominator
	}

}
