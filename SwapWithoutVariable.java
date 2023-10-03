public class SwapWithoutVariable {
        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 10;
    
            System.out.println("Before swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
    
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
    
            System.out.println("After swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
    }
