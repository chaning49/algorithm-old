import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(han(sc.nextInt()));
    }

    public static int han(int n) {
        int cnt = 0;
        if (n < 100) return n;
        else {
            cnt = 99;
            for (int i = 100; i <= n; i++) {
                int n100 = i / 100;
                int n10 = (i % 100) / 10;
                int n1 = ((i % 100) % 10) % 10;

                if ((n100 - n10) == (n10 - n1)) cnt ++;
            }
        }
        return cnt;
    }
}