/*
Create a class Data with data members height and breadth of the object given by the user and member functions get_data() to read the values and put_data() to display the values. Create another class Rectangle that inherits class Data and implements its methods areaRectangle() and perimeterRectangel() that computes the area and perimeter of a rectangle. Create another class Triangle that inherits class Data and implements its methods areaTriangle() and perimeterTriangle() that computes the area and perimeter of a triangle
*/

import java.util.*;

class Data {
  double height, breadth;
  double area, perimeter;

  Scanner sc = new Scanner(System.in);

  Data() {height=0; breadth=0;}
  
  void get_data(){
    System.out.println("\nEnter height: ");
    height = Double.parseDouble(sc.nextLine());
    
    System.out.println("Enter breadth: ");
    breadth = Double.parseDouble(sc.nextLine());
  }
  
  void put_data(){
    System.out.println("\nHeight: " + height);
    System.out.println("Breadth: " + breadth);
  }
}

class Rectangle extends Data {
  void areaRectangle(){
    area = height * breadth;
    System.out.println("\nArea of Rectangle: " + area);
  }
  void perimeterRectangle(){
    perimeter = 2 * (height + breadth);
    System.out.println("Perimeter of Rectangle: " + perimeter);
  }
}

class Triangle extends Data {
  void areaTriangle(){
    area = 0.5 * height * breadth;
    System.out.println("\nArea of Triangle: " + area);
  }
  void perimeterTriangle(){
    perimeter = height + breadth * 2;
    System.out.println("Perimeter of Triangle: " + perimeter);
  }
}

class ques2 {
  public static void main(String[] args) {
    Rectangle ABCD = new Rectangle();
    Triangle XYZ = new Triangle();

    ABCD.get_data();
    ABCD.put_data();
    ABCD.areaRectangle();
    ABCD.perimeterRectangle();

    XYZ.get_data();
    XYZ.put_data();
    XYZ.areaTriangle();
    XYZ.perimeterTriangle();
  }
}