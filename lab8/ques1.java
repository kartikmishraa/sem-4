class Language {
  static String greeting = "hello!"; 
  void sayHello() {
    System.out.println(greeting);
  }
}

class English extends Language {
  static String greeting = "Hello!";
  void sayHello() {
    System.out.println(greeting);
  }
}

class Hindi extends Language {
  static String greeting = "Namaste!";
  void sayHello() {
    System.out.println(greeting);
  }
}

class ques1 {
  public static void main(String args[]) {
    Language obj1 = new Language();
    English obj2 = new English();
    Hindi obj3 = new Hindi();

    Language var;

    var = obj1;
    var.sayHello();

    var = obj2;
    var.sayHello();

    var = obj3;
    var.sayHello();
  }
}