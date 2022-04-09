/*
WAP in java which will implements the concept of ArrayIndexOutOfBoundsException.
*/

class ques4 {
  void Test(int arr[]) {
    try {
      System.out.println(arr[100]);
      
    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println(err);
    }
  } 

  public static void main(String[] args) {
    int[] myArr = {1, 2, 3, 4, 5};
    
    ques4 obj = new ques4();
    obj.Test(myArr);
  }
}