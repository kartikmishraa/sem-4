/*
WAP in java which will display the use of constructor and constructor overloading.
*/

class sayHello {
  sayHello() {
    System.out.println("Hello!");
  }

  sayHello(int num) {
    int i = 0;
    while(i < num) {
      System.out.println("Hello!");
      i++;
    }
  }

  sayHello(String greeting) {
    System.out.println(greeting);
  }
}

class ques4 {
  public static void main(String[] args) {
    sayHello obj1 = new sayHello();
    sayHello obj2 = new sayHello(3);
    sayHello obj3 = new sayHello("good morning!");
  }
}