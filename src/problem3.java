
import java.util.Scanner;

public class problem3 {
    public static boolean isPrime(int n) {
        if (n <=1) return false;
        if(n == 2) return true;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if(isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}