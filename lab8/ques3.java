class Name {
  String name;

  Name(String n) {
    name = n;
  }
}

class Age extends Name {
  int age;

  Age(String n, int a) {
    super(n);
    age = a;
  } 

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

class ques3 {
  public static void main(String[] args) {
    Age obj = new Age("Kartik Mishra", 20);

    obj.display();
  }
}