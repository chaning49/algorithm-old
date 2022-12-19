import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] change = {500, 100, 50, 10, 5, 1};
        Scanner sc = new Scanner(System.in);

        int n = 1000 - sc.nextInt();
        int cnt = 0;

        for (int c : change) {
            cnt += n / c;
            n %= c;
        }
        System.out.println(cnt);
    }
}