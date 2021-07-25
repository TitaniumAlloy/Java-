import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}

/** Normal way **/

import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long factNumber = 1;
        
        if (n == 0) {
            return factNumber;
        } else {
            for (int i = 1; i <= n; i++) {
                factNumber *= i;
            }
        }
        return factNumber;
        
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
