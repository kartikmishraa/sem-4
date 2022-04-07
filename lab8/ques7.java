class Car {
  String c_name;
  double mileage;

  Car(String n, double m) {
    c_name = n;
    mileage = m;
  }
  
  public String toString() {
    return c_name + " " + mileage; 
  }
}

class ques7 {
  public static void main(String[] args) {
    Car swift = new Car("Swift", 18.25);

    System.out.println(swift);
  }
}