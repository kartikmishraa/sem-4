/*
Create a user defined exception named CheckArgument to check the number of arguments passed through command line. If the number 
of arguments is < 4, thro CheckArgument, else print the sum of squares of all the four elements.
*/

class CheckArgument extends Exception {
  CheckArgument() {
    super("Number of arguments > 4");
  }
}

class ques7 {
  void Test(String arr[]) {
    int n = arr.length;
    try {
      if (n > 4) throw new CheckArgument();
      else {
        int result = 0;
        for (int i = 0; i < n; i++) {
          result += Integer.parseInt(arr[i])*Integer.parseInt(arr[i]);
        }

        System.out.println("Result: " + result);
      }
    } catch (CheckArgument err) {
      System.out.println(err);
    }
  }
  
  public static void main(String[] args) {
    ques7 obj = new ques7();
    obj.Test(args);
  }
}