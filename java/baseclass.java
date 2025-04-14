 class cal2 
{
    int x;
    int y;
    void setxy(int b,int j)
    {
        x=b;  y=j;
    }
    void showXY()
    {
        System.out.println("result " +x  ,  +y);

    }
}
    class Derived extends cal2
    {
      int d;
      void setd(int i)
       {
         d=i;
       }
     void show()
	{
          System.out.println("result"+d);
	}
      
    }
	class mymain
  	{
	  public static void main(String[] args)
	  {
	    Derived ob=new Derived();
	    ob.setxy(10,20);
            ob.setd(50);
	    ob.showXY();
            ob.show();
	  }   
}