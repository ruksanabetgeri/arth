public class calculation{
        public static void main(String[] args) {
            int number = 27;
    
            double squareRoot = calculateSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
    
         
            int cubeRoot = calculateCubeRoot(number);
            System.out.println("Cube root of " + number + " is: " + cubeRoot);
        }
    
        
        public static double calculateSquareRoot(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Cannot compute square root of a negative number");
            }
            double guess = number / 2.0;
            double epsilon = 1e-6; 
            while (Math.abs(guess * guess - number) > epsilon) {
                guess = (guess + number / guess) / 2.0;
            }
            return guess;
        }
    
        public static int calculateCubeRoot(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Cannot compute cube root of a negative number");
            }
            int low = 0, high = number;
            while (low <= high) {
                int mid = (low + high) / 2;
                int midCubed = mid * mid * mid;
                if (midCubed == number) {
                    return mid;
                } else if (midCubed < number) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return high; 
        }
    }
    