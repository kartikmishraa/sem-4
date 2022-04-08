/*
Define an interface Motor with a data member – capacity and two methods such as run() and consume(). Define a Java class ‘Washing_machine’ which implements this interface and write the code to check the value of the interface data member through an object of the class.
*/

interface Motor {
  int capacity = 34;
  void run();
  void consume();
}

class Washing_machine implements Motor{
  public void run(){System.out.println("\nrun() running...");}
  public void consume(){System.out.println("\nconsume() running...");}
}

class ques2 {
  public static void main(String[] args) {
    Washing_machine obj = new Washing_machine();
    obj.run();
    obj.consume();

    System.out.println("\nCapacity: " + Motor.capacity);
  } 
}