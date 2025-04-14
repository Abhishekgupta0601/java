class Shape
{
 double area()
   {
     return 0;
   }
}
class Square extends Shape
{
  int l;
  Square(int l)
  {
    this.l=l;
  }
double area()
  {
    return l*l;
  }
}
class Rectangle extends Shape
{
  int l,b;
  Rectangle(int l,int b)
  {
   this.l=l;
   this.b=b;
  }
 double area()
  {
    return l*b;
  }
}
class mymain
{
 public static void main(String[] args)
   {
	Shape s  =new Square(11);
        Rectangle obr =new Rectangle(10,20);
        System.out.println("Area of sq =" +s.area());
        s  = obr;
        System.out.println("Area of sq=" +s.area());
       
        
   }	
}