//reversing numbers purely through math
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100;
        System.out.println(first * 100 + second * 10 + third);
    }
}
