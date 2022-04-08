/*
WAP in java which will define an interface called inter having a function disp() and a class variable int x. Create another class called student which will implement the interface and override the body of the method and also access var x without object in the main methods. Try to change the value of x and display the error.
*/

interface inter {
  void disp();
  int x = 10;
}

class student implements inter {
  public void disp() {
    System.out.println("disp() printing...");
  }
}

class ques3 {
  public static void main(String[] args) {
    student km = new student();
    km.disp();
    student.x = 20; // error: cannot assign a value to final
                    //         variable x
  }
}