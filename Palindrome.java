public class Palindrome 
{
    private int n;
 
    // Constructor to initialize the number
    public Palindrome(int n) {
        this.n = n;
    }
 
    // Method to check if the number is a palindrome
    public boolean isPalindrome() {
        int originalNum = n; // Store the original number
        int rem = 0;  // This will hold the reversed number
        int num = n;  // Temporary variable to manipulate the number
 
        // Reverse the number
        while (num > 0) {
            int digit = num % 10;  // Get the last digit
            rem = rem * 10 + digit;  // Add the digit to the reversed number
            num = num / 10;  // Remove the last digit
        }
 
        // Compare the original number with the reversed number
        return originalNum == rem;
    }
}
    class mymain
    {
 
      public static void main(String[] args) 
      {
         // Create an instance of the Palindrome class with number 121
         Palindrome obj = new Palindrome(434);
 
         // Check if the number is a palindrome
         if (obj.isPalindrome())
          {
             System.out.println("434 is a palindrome.");
         } else {
             System.out.println("434 is not a palindrome.");
         }
     }
    }
    
 