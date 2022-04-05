/*
WAP in java which will display the working of static methods and static block with the help of each separate example
*/

class greeting {
  static void sayHello() {
    System.out.println("HELLO!");
  }
}

class ques3 {
  // will be executed before main()
  static {System.out.println("printed before main!");}
  
  public static void main(String[] args) {
    
    System.out.println("hello world!");

    // static method called without instance creation
    greeting.sayHello();
  }
}