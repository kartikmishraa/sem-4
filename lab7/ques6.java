/*
Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width), box(length, width, height), wood box(length, width, height, thick)
*/

class plate {
  int length, width;
  
  plate(int l, int w) {
    length = l;
    width = w;
  }
}

class box extends plate {
  int height;
  
  box(int h, int l, int w) {
    super(l, w);
    height = h;
  }
}

class woodBox extends box {
  int thickness;
  
  woodBox(int l, int w, int h, int t) {
    super(h, l, w);
    thickness = t;
  }

  void show() {
    System.out.println("Thickness: " + thickness);
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
  }
}

class ques6 {
  public static void main(String[] args) {
    woodBox obj = new woodBox(5, 10, 15, 20);
    obj.show();
  }
}