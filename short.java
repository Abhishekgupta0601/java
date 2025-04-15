// Java Program to sort elements using custom sorting logic with short array

class Short {

    // Instance variable to hold the short array
    private short[] arr;

    // Constructor to initialize the array
    public void setX(short[] arr) {
        this.arr = arr;  // Initialize the instance variable with the given array
    }

    // Method to perform sorting
    public void sortArray() {
        // Outer loop for selecting each element
        for (int i = 0; i < arr.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < arr.length; j++) {

                // Checking elements
                short temp = 0;
                if (arr[j] < arr[i]) {  // if current element is smaller than the next one

                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Method to print the sorted array
    public void printArray() {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    class mymain
    {

    // Main driver method
    /**
     * @param args
     */
    public static void main(String[] args) {


         int[] arr = {50,40,90,5};

        
        Short obj = new Short();

        // Call the sort method to sort the array
        obj.sortArray();

        // Call the print method to display the sorted array
        obj.printArray();
    
    }
  }

