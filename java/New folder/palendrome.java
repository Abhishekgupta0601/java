 public class palendrom
{
    private int n;
} 
  public palendrom(int n)
{
    this.n=n;
}
 public boolean ispalendrom()
 {
    int originalnum = n;
    int rem=0;
    int num ;
 
    while(n>0)
    {
        n=n%10;
        rem=rem*10+rem;
        num =num/10;
    }
    return originalnum == rem;
}
class mymain
{
    public static void main(String[] args)
    {
       palendrom obj=new ispalendrom();
       
        obj.palendrom(n);

        if (originalnum == rem) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
    }
}