import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = 0;
        int naturalNumber = 0;
        int highestNumber = 0;
        
        while (scanner.hasNext() && elements < 1000) {
            naturalNumber = scanner.nextInt();
            if (naturalNumber % 4 == 0 && highestNumber < naturalNumber) {
                highestNumber = naturalNumber;
                elements++;
            }
        }
        System.out.println(highestNumber);
    }
}
