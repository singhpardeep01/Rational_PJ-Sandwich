// Team PJ-Sandwich -- Jessica Yang, Pardeep Singh
// APCS1 pd9
// HW32 -- Irrationality Stops Here
// 2015-11-17

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
		numerator = numerator / r.numerator;
		denominator = denominator / r.denominator;
	}


	// main method for testing
	public static void main(String[] args) {
		Rational r = new Rational(2, 3); // Stores the rational number 2/3
		Rational s = new Rational(1, 2); // Stores the rational number 1/2
		r.multiply(s); // Multiplies r by s, changes r to 2/6.  s remains 1/2
		System.out.println(r.toString());
		System.out.println(r.floatValue());
		r.divide(s); // Divides r by s, changes r to 2/3.  s remains 1/2
		System.out.println(r.toString());
		System.out.println(r.floatValue());
		Rational q = new Rational(); // tests default constructor	
		System.out.println(q.toString());
		Rational x = new Rational(1, 0); // tests constructor, 0 as denominator
		System.out.println(x.toString());
	}

}