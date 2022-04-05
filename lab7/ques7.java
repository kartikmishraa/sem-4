/*
Write a program in java to define a class Shape that has data member „area‟ and a member function showArea(). Derive two classes Circle and Rectangle from Shape class. Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle.
*/

class Shape {
  double area;
  void showArea() {
    System.out.println("\nArea: " + area);
  }w
}

class Circle extends Shape {
  double r;
  static double pi = 3.14;

  Circle(double r) {
    this.r = r;
  }

  void calcArea() {
    area = pi * r * r;
  }
}

class Rectangle extends Shape {
  double l, b;

  Rectangle(double l, double b) {
    this.l = l;
    this.b = b;
  } 

  void calcArea() {
    area = l * b;
  }
}

class ques7 {
  public static void main(String[] args) {
    
    Rectangle abcd = new Rectangle(5, 10);
    Circle XY = new Circle(5);

    abcd.calcArea();
    XY.calcArea();

    abcd.showArea();
    XY.showArea();
  } 
}