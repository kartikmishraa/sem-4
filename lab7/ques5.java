/*
WAP in java that will overload the area() method and find the area of the circle, triangle and rectangle.
*/

class Shape {
  double area; 
  static double pi = 3.14;

  double Area(double a) {
    area = pi * a * a;
    return area;
  }

  double Area(double a, double b) {
    area = a * b;
    return area;
  }

  double Area(double a, double b, double c) {
    double s = (a + b + c) / 2;
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;
  }
}

class ques5 {
  public static void main(String[] args) {

    Shape circle = new Shape();
    Shape rectangle = new Shape();
    Shape triangle = new Shape();
    
    System.out.println("Area of Circle: " + circle.Area(5));
    System.out.println("Area of Rectangle: " + rectangle.Area(5,10));
    System.out.println("Area of Circle: " + triangle.Area(5, 6, 7.8));
  }
}