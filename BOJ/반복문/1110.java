import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cmp = n;
        int cnt = 0;

        do {
            int l = cmp / 10;
            int r = cmp % 10;
            cmp = (r * 10) + (l + r) % 10;
            cnt += 1;
        } while (n != cmp);
        System.out.println(cnt);
    }
}