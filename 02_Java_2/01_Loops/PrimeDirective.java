import java.util.ArrayList;

class PrimeDirective {
  
  public boolean isPrime(int number) {
    // Check whether number is 2 or less than 2
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }

    // Check if number is divisible by any number than itself
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    // Create new array to store prime numbers
    ArrayList<Integer> primes = new ArrayList<Integer>();
    // For each loop
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    // Return ArrayList
    return primes;
  }
  
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    // Numbers to test
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.onlyPrimes(numbers));
  }  
}