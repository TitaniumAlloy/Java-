//Teranary operator usage
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        while (true) {
            num = sc.nextInt();
            if (num == 0 || sum >= 1000) {
                break;
            }
            sum += num;
        }
        System.out.println(sum >= 1000 ? sum - 1000 : sum);
    }
}

//While True - not efficient but true
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        
        while (true) {
            int number = scan.nextInt();
            if (number == 0) {
                break;
            } else {
                sum += number;
            }
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            
        }
        System.out.println(sum);    
    }
}

//Original Code
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        
        while (scanner.hasNext()) {
            number = scanner.nextInt();
            
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (number == 0) {
                System.out.println(sum);
                break;
            } else {
                sum += number;
            }
        }        
    }
}
