/*
Implement a class Point having data members x and y.
Point() 
Point(int, int)
Point(Point)
findDistance() -> distance from origin (0,0)
findDistance(int, int)
findDistance(Point)
void Show()
*/

class Point {
  int x, y;
  double d;
  
  Point(){x=0; y=0;}

  // functions to return x and y
  int getX() {return x;}
  int getY() {return y;}
  
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point(Point x) {
    this.x = x.getX();
    this.y = x.getY();
  }

  // function to calculate distance using 2d formula
  double dCalc(int x2, int y2) {
    double var = Math.sqrt(Math.pow((x2-x), 2) + Math.pow((y2-y), 2));
    return var;
  }

  // findDistance1
  void findDistance() {
    int x2=0, y2=0;

    d = dCalc(x2, y2);

    System.out.println("Distance: " + d);
  }

  // findDistance2
  void findDistance(int x2, int y2) {
    d = dCalc(x2, y2);

    System.out.println("Distance: " + d);
  }

  // findDistance3
  void findDistance(Point p) {
    d = dCalc(p.getX(), p.getY());

    System.out.println("Distance: " + d);
  }

  void Show() {
    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
}

class ques1 {
  public static void main(String args[]) {
    Point p1 = new Point(12, 15);
    Point p2 = new Point(5, 5);
    Point p3 = new Point(p1);

    // displaying distances
    p2.findDistance(p2);
    p2.findDistance(p1);
    p1.findDistance(2,2);
    p3.findDistance();

    // displaying points (both points will be same)
    p1.Show();
    p3.Show();
  }
}