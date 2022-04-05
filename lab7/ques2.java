/*
WAP in java which will display the working of static variable with a comparison of non static with the help of a counter program.
*/

class student {
  static int totalStudents = 0;
  
  String name;

  student(String name) {
    totalStudents++;
    this.name = name;
  }

  void showDetails() {
    System.out.println("\nName: " + name);
    System.out.println("\nTotal Students: " + totalStudents);
  }
}

class ques2 {
  public static void main(String[] args) {
    student kartik = new student("kartik");
    student samyak = new student("samyak");
    
    kartik.showDetails();
  }
}