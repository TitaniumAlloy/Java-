import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        return a < b ? b < c ? 3 : 2 : a < c ? 3 : 1; 
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}

import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        return a >= b && a >= c ? 1 : b >= a && b >= c ? 2 : 3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}

//** Normal answers below **//

import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        return max == a ? 1 : max == b ? 2 : 3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
