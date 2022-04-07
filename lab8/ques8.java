abstract class student {
  int rollno = 2005029;
  int regno = 101010;

  abstract void course();
}

class kiitian extends student {
  void course() {
    System.out.println("roll: " + rollno);
    System.out.println("reg no: " + regno);
  }
}

class ques8 {
  public static void main(String[] args) {
    student obj = new kiitian();

    obj.course();
  }
}