public class Main {

  public boolean isPrime(int number) {
    double squareRoot = Math.sqrt(number);

    if(number>2 && number%2==0 || squareRoot%1==0) return false;

    int wholePart = (int)squareRoot;
    for(int i=2; i<=wholePart; i++) {
      if(this.isPrime(i) && number%i==0) return false;
    }
    
    return true;
  }

  public int sumOfThePrimeNumbersUpTo(int limit) {
    int sum = 0;
    for(int i=1; i<limit; i++) {
      if(this.isPrime(i)) sum += i;
    }
    return sum;
  }

  public int sumOfTheFirstNPrimeNumbers(int N) {
    int sum = 0;
    int counter = 0, i = 1;

    while(counter <= N) {
      if(this.isPrime(i)) {
        sum += i;
        counter++;
      }
      i++;  
    }
    return sum;
  }

  public static void main(String[] args) {
    Main main = new Main();

    // La suma de los números primos que hay entre los 50 primeros números
    System.out.println("La suma es: " + main.sumOfThePrimeNumbersUpTo(50));

    // La suma de los 50 primeros números primos
    System.out.println("La suma es: " + main.sumOfTheFirstNPrimeNumbers(50));
  }
}