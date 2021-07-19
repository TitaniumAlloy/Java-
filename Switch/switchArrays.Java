import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        switch (input) {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}

/** WAY MORE COOLER **/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] shapes = {"square", "circle", "triangle", "rhombus"};
        int position = scanner.nextInt() - 1;
        if (position >= 0 && position < shapes.length) {
            System.out.println("You have chosen a " + shapes[position]);
        } else {
            System.out.println("There is no such shape!");
        }
    }
}
