/*
Rational class. num & denum data members
Appropriate constructors
Rational add(Rational) 
Rational subtract(Rational) 
Rational mul(Rational)
Rational divide(Rational)
boolean isEqual(Rational) -> to check if 2 objects are equal
void show() -> display as 'num/denum'
*/

class Rational {
  int num, denum;

// Utility functions start
  // functions to return num and denum
  int getNum() {return num;}
  int getDen() {return denum;}

  // function to return absolute value
  int absoluteOf(int x) {return Math.abs(x);}

  // function to return GCD of 2 integers
  int GCD(int a, int b) {
    if (a == 0)
      return b;
    if (b == 0)
      return a;

    if (a==b)
      return a;

    if (a>b)
      return GCD(a-b, b);

    return GCD(a, b-a);
  }
// Utility functions end

  // Constructor1 (default)
  Rational() {num=0; denum=1;}

  // Constructor2 (parameterized)
  Rational(int num, int denum) {
    this.num = num;
    this.denum = denum;
  }

  // Constructor3 (copy)
  Rational(Rational r) {
    this.num = r.getNum();
    this.denum = r.getDen();
  }

  // subtract() function
  Rational add(Rational r) {
    int numSum = r.getNum() * (denum) + num * (r.getDen());
    int denumSum = denum * r.getDen();

    int GCD = GCD(numSum, denumSum);
            
    numSum /= GCD;
    denumSum /= GCD;

    Rational sum = new Rational(numSum, denumSum);
    
    return sum;
  }

  // subtract() function
 /* Rational subtract(Rational r) {
    
  }*/

  void show() {
    System.out.format("\n %d/%d \n", num, denum);
  }
}

class ques2 {
  public static void main(String args[]) {
    Rational r1 = new Rational(2, 4);
    Rational r2 = new Rational(4, 8);

    Rational r3 = r1.add(r2);
    r3.show();
  }
}