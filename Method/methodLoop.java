public class HelloWorld{

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            System.out.println(c);
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String []args) {
        System.out.println(gcd(3, 6));    
    }    
}
