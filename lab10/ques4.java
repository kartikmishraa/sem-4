/*
Create an Interface INTER-1 having a method disp(). Create a  class student who will implementthe interface INTER-1 and override the disp() method. The class have their own methods called nonIfaceMethod() also. Create the object of the class and call both the methods. Also create a reference object of the interface and allocate memory to the class type. And then try to call both the methods. Also display the error.
*/

interface INTER1 {
  void disp();
}

class student implements INTER1 {
  public void disp() {System.out.println("disp() running...");}
  public void nonIfaceMethod() {
    System.out.println("nonIfaceMethod() running...");
  }
}

class ques4 {
  public static void main(String[] args) {
    student obj1 = new student();
    obj1.disp();
    obj1.nonIfaceMethod();

    INTER1 obj2 = new student();
    obj2.disp();
    obj2.nonIfaceMethod(); // error: cannot find symbol
                          // obj2.nonIfaceMethod() 
  }
}