public class XPattern {
        public static void main(String[] args) {
            int rows = 5;
            
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows; j++) {
                    if (j == i || j == rows - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
