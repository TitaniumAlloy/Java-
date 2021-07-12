// Multiple main are in this code to reduce amount of files in the folder.
// These are for reference purposes on how to shut down a loop in 3 different way.

// Regular while loop. More lines and ineffecient
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int sum = 0;

        while (input != 0) {
            sum += input;
            input = scanner.nextInt();
        }
        
        System.out.println(sum);

    }
}

// While loop less lines and effecient
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            int thisInt = sc.nextInt();
            sum += thisInt;
            if (thisInt == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}

// Do-while loop leasat lines and the most effecient.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            n = scanner.nextInt();
            sum += n;
        } while (n != 0);
        System.out.print(sum);
    }
}
