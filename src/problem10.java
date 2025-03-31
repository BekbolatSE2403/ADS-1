import java.util.Scanner;

public class problem10 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        TimeComplexity.measureTime(() -> {
            System.out.println(gcd(a, b));
        });
    }
}
