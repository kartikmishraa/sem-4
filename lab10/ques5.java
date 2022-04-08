/*
Create two interface A and B. Interface A will have two methods called math1() and math2() and interface B which will be a child of interface A and having methods called meth3(). Create a class called student who will implements B and override all the function. Check the error by only implementing interface B methods.
*/

interface A {
  void math1();
  void math2();
}

interface B extends A {
  void math3();
}

// error: The type student must implement the inherited 
// abstract method A.math2() and A.math1()

class student implements B {
  // public void math1() {}
  // public void math2() {}
  public void math3() {}
}

