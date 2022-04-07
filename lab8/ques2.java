class Account {
  int acc_no;
  double balance;

  Account(int ACC, double BAL) {
    acc_no = ACC;
    balance = BAL;
  }
  
  void disp() {
    System.out.println("Account number: " + acc_no);
    System.out.println("Account balance: Rs." + balance);
  }
}

class Person extends Account {
  String name;
  int aadhar_no;

  Person(int a, double b, String n, int an) {
    super(a, b);
    name = n;
    aadhar_no = an;
  }

  void disp() {
    System.out.println("\nName: " + name);
    System.out.println("Aadhar: " + aadhar_no);
    super.disp();
  }
}

class ques2 {
  public static void main(String[] args) {
    Person kartik = new Person(112200, 1200, "Kartik", 808080);
    Person krishna = new Person(221100, 2000, "Krishna", 101010);
    Person samyak = new Person(330011, 3000, "Samyak", 202020);
    Person manvi = new Person(441100, 5000, "Manvi", 303030);
    Person muskan = new Person(552211, 2400, "Muskan", 505050);

    kartik.disp();
    krishna.disp();
    samyak.disp();
    muskan.disp();
    manvi.disp();
  }
}