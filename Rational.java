public class Rational {
    // instance vars
    private int numerator;
    private int denominator;

    // default constructor
    public Rational() {
	numerator = 0;
	denominator = 1;
    }

    //
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

    //
    public String toString() {
	return 
    }


}
