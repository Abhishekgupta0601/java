class Shape 
{
   int a;
 void calculateArea()
 { 
   System.out.println("Calculating area...");
 } 
}

class Rectangle extends Shape
 {
    double l, w;
    Rectangle(double l, double w)
   { 
    this.l = l; this.w = w;
  }
    void calculateArea()
   { 
    System.out.println("Rectangle Area: " + (l * w)); }
   }

class Triangle extends Shape
 {
    double b, h;
    Triangle(double b, double h)
   {
     this.b = b; this.h = h;
   }
    void calculateArea() 
  {
   System.out.println("Triangle Area: " + (0.5 * b * h));
  }
}

 class MyMain
 {
    public static void main(String[] args)
 {
      Rectangle obj1 = new Rectangle(10,5);
      Triangle obj2= new Triangle(30,20);
      obj1.calculateArea();
      obj2.calculateArea();
    }
}



