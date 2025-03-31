import java.util.Scanner;

public class problem9 {
    public static int binomial(int n, int k) {
        if (n == k || k == 0) return 1;

        return binomial(n - 1, k-1) + binomial(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int result = binomial(n, k);
        System.out.println(result);
    }
}
