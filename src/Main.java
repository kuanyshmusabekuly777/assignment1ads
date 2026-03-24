import java.util.Scanner;
 
public class Main {
 
    // ===== PART 1: Recursion with Numbers =====
 
    // Task 1: Print digits of a number
    static void printDigits(int n) {
        if (n < 0) n = -n; // handle negative
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }
 
    // Task 2: Sum of array elements (recursive), then compute average
    static int sumArray(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return arr[index] + sumArray(arr, index + 1);
    }
 
    // Task 3: Prime number check
    static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }
 
    // Task 4: Factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
 
    // ===== PART 2: Recursion with Sequences =====
 
    // Task 5: Fibonacci number
    static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
 
    // Task 6: Power function a^n
    static long power(long a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
 
    // Task 7: Reverse output (read n numbers, print in reverse)
    static void reverseOutput(Scanner sc, int n) {
        if (n == 0) return;
        int x = sc.nextInt();
        reverseOutput(sc, n - 1);
        System.out.print(x + " ");
    }
 
    // ===== PART 3: Recursion with Strings =====
 
    // Task 8: Check if string contains only digits
    static String checkDigits(String s, int index) {
        if (index == s.length()) return "Yes";
        if (!Character.isDigit(s.charAt(index))) return "No";
        return checkDigits(s, index + 1);
    }
 
    // Task 9: Count characters in a string
    static int countChars(String s, int index) {
        if (index == s.length()) return 0;
        return 1 + countChars(s, index + 1);
    }
 
    // Task 10: GCD using Euclidean Algorithm
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    // ===== MAIN =====
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("=== Task 1: Print Digits ===");
        System.out.println("Enter number:");
        int num = sc.nextInt();
        printDigits(num);
 
        System.out.println("\n=== Task 2: Average of Elements ===");
        System.out.println("Enter count of elements:");
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        for (int i = 0; i < n2; i++) arr[i] = sc.nextInt();
        int sum = sumArray(arr, 0);
        double avg = (double) sum / n2;
        System.out.println(avg);
 
        System.out.println("\n=== Task 3: Prime Number Check ===");
        System.out.println("Enter number:");
        int p = sc.nextInt();
        System.out.println(isPrime(p, 2) ? "Prime" : "Composite");
 
        System.out.println("\n=== Task 4: Factorial ===");
        System.out.println("Enter number:");
        int f = sc.nextInt();
        System.out.println(factorial(f));
 
        System.out.println("\n=== Task 5: Fibonacci ===");
        System.out.println("Enter n:");
        int fib = sc.nextInt();
        System.out.println(fibonacci(fib));
 
        System.out.println("\n=== Task 6: Power ===");
        System.out.println("Enter a and n:");
        long a = sc.nextLong();
        int pw = sc.nextInt();
        System.out.println(power(a, pw));
 
        System.out.println("\n=== Task 7: Reverse Output ===");
        System.out.println("Enter count and numbers:");
        int n7 = sc.nextInt();
        reverseOutput(sc, n7);
        System.out.println();
 
        System.out.println("\n=== Task 8: Check Digits in String ===");
        System.out.println("Enter string:");
        String s8 = sc.next();
        System.out.println(checkDigits(s8, 0));
 
        System.out.println("\n=== Task 9: Count Characters ===");
        System.out.println("Enter string:");
        String s9 = sc.next();
        System.out.println(countChars(s9, 0));
 
        System.out.println("\n=== Task 10: GCD ===");
        System.out.println("Enter two numbers:");
        int g1 = sc.nextInt();
        int g2 = sc.nextInt();
        System.out.println(gcd(g1, g2));
 
        sc.close();
    }
}
 
