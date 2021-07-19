
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        String symbol = scanner.next();
        long inputTwo = scanner.nextLong();
        
        switch (symbol) {
            case "+":
                System.out.println(input + inputTwo);
                break;
            case "-":
                System.out.println(input - inputTwo);
                break;
            case "*":
                System.out.println(input * inputTwo);
                break;
            case "/":
                if (inputTwo == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    System.out.println(input / inputTwo);
                    break;
                }
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}


//** Terenary operator **//
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long firstNum = sc.nextLong();
        String symbol = sc.next();
        long secondNum = sc.nextLong();


        switch (symbol) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "/":
                System.out.println(secondNum != 0 ? firstNum / secondNum : "Division by 0!");
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
