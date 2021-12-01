public class Rational {
	protected int p;
	protected int q;

	public Rational() {
		p = 0;
		q = 1;
	}

	public Rational(int a, int b) {
		p = a;
		q = b;
	}

	public double floatValue() {
		return (float) p / q;
	}

	public String toString() {
		return p + "/" + q;
	}

	public Rational multiply(Rational r) {
		p = p * r.p;
		q = q * r.q;

		return this;
	}

	
	public Rational divide(Rational r) {
		if (r.p == 0) {
			System.out.println("you tried to divide by 0, no division was performed");
		} else {
			p = p * r.q;
			q = q * r.p;
		}

		return this;
	}

	public static void main(String[] args) {
		Rational r1 = new Rational(10, 5);
		Rational r2 = new Rational(3, 6);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1.floatValue());
		r1.multiply(r2);
		System.out.println(r1);
		r1.divide(r2);
		System.out.println(r1);
		
		System.out.println("=============");
		Rational r3 = new Rational(2, 3);
		Rational r4 = new Rational();

		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r3.floatValue());
		r3.multiply(r4);
		System.out.println(r3);
		r3.divide(r4);
		System.out.println(r3);


	}	


}
