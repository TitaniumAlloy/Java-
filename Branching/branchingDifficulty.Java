import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int stop = 1;
        
        for (int i = 0; i <= counter; i++) {
            for (int j = 0; j < i; j++) {
                if (stop > counter) {
                    break;
                }
                System.out.print(i + " ");
                stop++;
            }
        }
    }
}
//Prints number based on it's value until it's sequence.
