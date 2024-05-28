/**
 * @file Main.java
 * @brief Основной класс для всех операций над числом Фибоначчи
 */
public class Main {
    public static void main(String[] args) {
        int n = 15; // Находим 15-е число Фибоначчи
        FibonacciCalculator fibCalculator = new FibonacciCalculator();
        int fibNumber = fibCalculator.calculateFibonacciNumber(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibNumber);

        SumOfDigits sumOfDigits = new SumOfDigits();
        int sumOfFibDigits = sumOfDigits.calculateSumOfDigits(fibNumber);
        System.out.println("The sum of digits in the " + n + "th Fibonacci number is: " + sumOfFibDigits);

        PrimeChecker primeChecker = new PrimeChecker();
        boolean isFibNumberPrime = primeChecker.isPrime(fibNumber);
        System.out.println("Is the " + n + "th Fibonacci number prime? " + isFibNumberPrime);

        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int factorialOfFibNumber = factorialCalculator.calculateFactorial(fibNumber);
        System.out.println("The factorial of the " + n + "th Fibonacci number is: " + factorialOfFibNumber);
    }
}