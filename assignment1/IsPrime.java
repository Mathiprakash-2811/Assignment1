package assignment1;

public class IsPrime {

	public static void main(String[] args) {
    int number = 17; 
        
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false; 
                break;
            }
        }

        if (isPrime && number > 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

	}

}
