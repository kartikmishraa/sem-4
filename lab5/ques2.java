/*
  Definition class : Equation, Application class: EquationDemo

  Equation
    a, b, c
    void setCoefficients(int, int, int)
    void findRoots()
*/

class Equation {
  int a, b, c;
  float real, imaginary;

  void setCoefficients(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;

    System.out.println("Coefficients set!");
  }

  void findRoots() {
    boolean isReal = true;
    float det = b * b - (4 * a * c);
    float root1 = 0;
    float root2 = 0;

    if (det > 0) {
      System.out.println("Roots are real and distinct");

      root1 = (-b + (float) Math.sqrt(det)) / (2 * a);
      root2 = (-b - (float) Math.sqrt(det)) / (2 * a);

    } else if (det == 0) {
        System.out.println("Roots are real and equal");

        root1 = -b / (2 * a);
        root2 = root1;

    } else {
        isReal = false;
        System.out.println("Roots are complex and distinct");

        real = -b / (2 * a);
        imaginary = (float) Math.sqrt(det) / (2 * a);
      }

    if (isReal) {
      System.out.println("root 1: " + root1);
      System.out.println("root 2: " + root2);

    } else {
        System.out.println("real: " + real);
        System.out.println("imaginary: " + imaginary);
      }
  }
}

class ques2 {
  public static void main(String args[]) {
    Equation eq1 = new Equation();
    eq1.setCoefficients(1, 2, 1);
    eq1.findRoots();
  }
}