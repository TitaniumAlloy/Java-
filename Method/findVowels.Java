import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}

/** --------------------------other methods------------------------------------------------ **/
    public static boolean isVowel(char ch) {
        return "aeiou".contains(Character.toString(ch).toLowerCase());
    }

    public static boolean isVowel(char ch) {
        // write your code here
        switch (ch) {
            case 'a':
            case 'A':
            case 'i':
            case 'I':
            case 'u':
            case 'U':
            case 'e':
            case 'E':
            case 'o':
            case 'O':
                return true;
            default: return false;
        }
    }

    public static boolean isVowel(char ch) {
        String vowels = "aeiou";
        return vowels.indexOf(Character.toLowerCase(ch)) >= 0;
    }
