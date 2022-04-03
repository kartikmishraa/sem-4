/* Definition class : Circle, Application class: Circle demo 

Circle (object)
  radius
  void setDim(float)
  void findArea()
  void findPerimeter()
*/

class Circle {
  float radius, perimeter, area;

  public void setDim(float r) {
    radius = r;
    System.out.println("Radius set as: " + r);
  }

  public void findPerimeter() {
    perimeter = 2f * 3.14f * radius;
    System.out.println("Perimeter: " + perimeter);
  }

  public void findArea() {
    area = 3.14f * radius * radius;
    System.out.println("Area: " + area);
  }
}

class ques1 {
  public static void main(String args[]) {
    Circle c1 = new Circle();
    c1.setDim(5);
    c1.findPerimeter();
    c1.findArea();
  }
}