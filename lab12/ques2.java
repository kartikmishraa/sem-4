/*
A subclass exception must appear before super-class exception. Justify this with suitable Java programs.
*/

class ques2 {
  public static void main(String args[]){
    try{ 
      int y = 0;
      int x = 10 / y;

    } catch (NullPointerException err) {
      System.out.println("1st block");
      
    } catch (ArithmeticException err) {
      System.out.println("2nd block"); 
      
    } catch (Exception err) {  // Superclass must come after Subclass                                // else compile-time error!
      System.out.println("3rd block");
    }
    
    System.out.println("After try/catch Blocks");
  }
}