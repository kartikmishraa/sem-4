/*
WAP in java which demonstrate the use of finally block in java
*/

class ques8 {
  void Test() {
    System.out.println("--Report--");
    try {
      String var = null;
      var = "kartik";
      System.out.println("Length of Name: " + var.length()); 
      
    } catch (NullPointerException err) {
      System.out.println(err);
      
    } finally {
      System.out.println("--End-of-Report--");
    }
  }
  
  public static void main(String[] args) {
    ques8 obj = new ques8();
    obj.Test();
  }
}