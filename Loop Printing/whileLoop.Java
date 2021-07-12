//Next character possible through Unicode table as a reference and increment operator
//If the input amount is unknown from a file, then you invoke hasNext(). Ex: scanner.hasNext();

public class WhileDemo {

    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter);
            letter++;
        }
        
        //Example of sequence of unknown length
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }
        System.out.println(sum);
    }
}
