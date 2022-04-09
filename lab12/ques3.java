/*
Assign a string with null and try to find out the length of the string and catch the necessary exception. NullPointerException
*/

class ques3 {
  void Test(String str) {
    try {      
      System.out.println(str.length()); 
      
    } catch (NullPointerException err) {
      System.out.println(err);
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Execution starting...");

    ques3 obj = new ques3();
    obj.Test(null);
  }  
}