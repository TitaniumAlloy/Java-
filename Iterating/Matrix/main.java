import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        char[][] star = new char[length][length];
        
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                if (i == j || star.length / 2 == i || star.length / 2 == j || star.length - 1 - i  == j) {
                    star[i][j] = '*'; 
                } else {
                    star[i][j] = '.';
                }
            }
        }
        
        for (char[] ch : star) {
            for (char column : ch) {
                System.out.print(column + " ");
            }
            System.out.println("");
        }
    }
}
