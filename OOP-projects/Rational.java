// Rational:  Chap 8
//             - BuildingJavaPrograms 3rd Edition Programming Problem #1
//             - Deitel Book Chap 8.3

// YOUR TASK:
//      Write ALL of the methods below.


// Get rid of the word "SHELL"
public class Rational
{ 
      // Declare 'numerator' & 'denominator'
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
   int numerator;
   int denominator;

   public Rational()
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      this.numerator = 0;
      this.denominator = 1;
   }
   // initialize numerator part to n and denominator part to d
   public Rational( int n, int d )
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      this.numerator = n;
      this.denominator = d;
       //reduce();
   }

    // Use GET and SET methods!
      // Set the numerator
   public void setNumerator(int n)
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      this.numerator = n;
   }
   // Set the denominator
   public void setDenominator(int d)
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      this.denominator = d;
   }
   
   // Get the numerator
   public int getNumerator()
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return this.numerator;
   }
   // Get the denominator
   public int getDenominator()
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return this.denominator;
   }   
   
   // add two Rational numbers
   public Rational add(Rational right)
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      if (this.denominator == right.denominator) {
          return (new Rational(this.numerator + right.numerator, this.denominator));
      }
      return (new Rational(this.numerator * right.denominator + right.numerator * this.denominator,
                            this.denominator * right.denominator + right.denominator * this.denominator));
    }

   // subtract two Rational numbers
   public Rational subtract( Rational right )
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      if (this.denominator == right.denominator) {
          return (new Rational(this.numerator - right.numerator, this.denominator));
      }
      return (new Rational(this.numerator * right.denominator - right.numerator * this.denominator,
                            this.denominator * right.denominator - right.denominator * this.denominator));
   }

   // multiply two Rational numbers
   public Rational multiply( Rational right )
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return (new Rational(this.numerator * right.numerator, this.denominator * right.denominator));
   }

   // divide two Rational numbers
   public Rational divide( Rational right )
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return (new Rational(this.numerator * right.denominator, this.denominator * right.numerator));
   }

   // reduce the fraction
   private void reduce()  // BONUS!!!
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
   }
   
   public float toFloat() {
       return this.numerator / this.denominator;
   }
   
   // return String representation of a Rational number
   public String toString()
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return "(" + this.numerator + "/" + this.denominator + ")";
   }

   // return floating-point String representation of
   // a Rational number
   public String toFloatString()
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return "" + this.toFloat();
   }
   // return greaterThan, lessThan, or equalTo
   public boolean greaterThan(Rational right)
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return this.toFloat() > right.toFloat()  ? true : false;
   }
   
   public boolean lessThan(Rational right)
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return this.toFloat() < right.toFloat()  ? true : false;
   }   
   
   public boolean equalTo(Rational right)
   {
      // >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
      return this.toFloat() == right.toFloat()  ? true : false;
   }   

}  // Rational
