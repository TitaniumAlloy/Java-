import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int climbPerDay = scanner.nextInt();
        int fallPerDay = scanner.nextInt();
        int totalHeight = 0;
        int days = 0;
        
        while (height > totalHeight) {
            totalHeight += climbPerDay;
            if (height <= totalHeight) {
                days++;
                break;
            }
            totalHeight -= fallPerDay;
            days++;
        }
        
        System.out.println(days);
    }
}

//Professional solution below
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextInt();
        double dayUp = scanner.nextInt();
        double nightDown = scanner.nextInt();
        int finalDay = (int) Math.ceil((height - dayUp) / (dayUp - nightDown)) + 1;

        System.out.println(finalDay);

    }
}
