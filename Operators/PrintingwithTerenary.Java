//Demonstration of using nexting operator with printing.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();
        System.out.println(naturalNumber + " ");
        while (naturalNumber != 1) {
            System.out.print((naturalNumber = naturalNumber % 2 == 0 ? naturalNumber / 2 
                : naturalNumber * 3 + 1) + " ");
        }
    }
}
