public class FindLargestNumberInArray {
        public static void main(String[] args) {
            int[] numbers = { 5, 10, 15, 7, 2, 25, 30 };
    
            int largest = numbers[0];
    
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }
    
            System.out.println("The largest number in the array is: " + largest);
        }
    }
