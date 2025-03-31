import java.util.Scanner;

public class problem2{
    public static double average(int[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;

    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(average(arr));
    }
}
