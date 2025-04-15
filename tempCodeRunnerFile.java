class cal2 
{
    int x;
    int y;
    void setxy(int b,int j)
    {
        x=b;  y=j;
    }
    void showxy()
    {
        System.out.print("result x=" +x);
        System.out.print("result y=" +y);

    }
}
    class Derived extends cal2
    {
      int d;
      void setd(int i)
       {
         d=i;
       }
     void showd()
	{
          System.out.println("result d=" +d);
	}
      
    }
	class mymain
  	{
	  public static void main(String[] args)
	  {
	    Derived ob=new Derived();
	    ob.setxy(10,20);
            ob.setd(50);
	          ob.showxy();
            ob.showd();
	  }   
  }