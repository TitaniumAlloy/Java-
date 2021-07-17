import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean ordered = true;
        boolean descendingOrder = false; 
        boolean ascendingOrder = false;
        int prevNum = 0;
        int newNum = 0;
        
        do {
            
            newNum = scanner.nextInt();
                        
            if (!descendingOrder && !ascendingOrder) {
                
                if (prevNum == 0) {
                    prevNum = newNum;
                }
                ascendingOrder = newNum > prevNum;
                descendingOrder = newNum < prevNum;

            } else if (newNum != 0 && ordered) {

                ordered = ascendingOrder == true ? newNum >= prevNum : newNum <= prevNum;
            }

            prevNum = newNum;
            
        } while (newNum != 0);
        
        System.out.println(ordered);        
        scanner.close();
    }
}
