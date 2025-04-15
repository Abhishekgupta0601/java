abstract class reverse {
    abstract int process(int num);
}

class reserve extends reverse {
    int process(int num) {
        int reverse = 0;
        while (num != 0) {
            int d = num % 10;  // Get the last digit
            reverse = reverse * 10 + d;  // Shift current reverse and add the new digit
            num = num / 10;  // Remove the last digit from num
        }
        return reverse;  // Return the reversed number
    }
}

class mymain {
    public static void main(String[] atrgs) {
        reserve obj = new reserve();
        int originalNumber = 123456789;
        int reversedNumber = obj.process(originalNumber);
        
        // Print the original and reversed number
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
