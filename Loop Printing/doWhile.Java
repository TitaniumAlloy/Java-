//Demonstration of Do while and Scanner. No input file currently.
//Do while used less in actual practice. Only for one run at times.

public class DoWhileDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            value = scanner.nextInt();
            System.out.println(value);
        } while (value != 0);
    }
}
