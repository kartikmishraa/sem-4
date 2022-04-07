class Shape {
  double area;
  void calcArea(){}
}

class Circle extends Shape {
  void calcArea(double radius) {
    area = radius * radius * 3.14;

    System.out.println("Area of Circle: " + area);
  }
}

class Triangle extends Shape {
  void calcArea(double a, double b, double c) {
    double s = (a + b + c) / 2;
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("Area of triangle: " + area);
  }
}

class Square extends Shape {
  void calcArea(double s) {
    area = s * s;

    System.out.println("Area of Square: " + area);
  }
}

class ques5 {
  public static void main(String[] args) {
    Circle c = new Circle();
    Triangle t = new Triangle();
    Square s = new Square();

    c.calcArea(5);
    t.calcArea(2, 4, 5);
    s.calcArea(4);
  }
}