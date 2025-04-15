 public class cal
 {
    public static void main(String[] args) 
    {
        int n1 = Integer.parseInt(args[0]);  // Corrected to parseInt and array indexing with []
        int n2 = Integer.parseInt(args[2]);  // Corrected to parseInt and array indexing with []
        switch (args[1])
        {
            case("+"):
            System.out.println("result"+(n1+n2));
            break;
            case("-"):
            System.out.println("result"+(n1-n2));
            break;
            case("*"):
            System.out.println("result"+(n1*n2));
            break;
            case("/"):
            System.out.println("result"+(n1/n2));
            break;
            case("%"):
            System.out.println("result"+(n1%n2));
            default:
            System.out.println("invalid operator");

        }
      
    }
 }
