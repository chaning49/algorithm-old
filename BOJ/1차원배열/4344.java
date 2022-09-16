import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            double avg = 0;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            avg = (double) sum / (double) n;

            for (int k = 0; k < n; k++) {
                if (arr[k] > avg)  cnt++;
            }
            System.out.printf("%.3f%%\n", ((double) cnt / (double) n) * 100);
        }
    }
}
