import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            boolean[] arr = new boolean[10];
            String sheep = sc.next();
            int num = Integer.parseInt(sheep);
            int count = 0;
            int cnt = 1;
            while (true) {
                for (int i = 0; i < sheep.length(); i++) {
                    int temp = Integer.parseInt(sheep.substring(i, i + 1));
                    if (!arr[temp]) {
                        arr[temp] = true;
                        count++;
                    }
                }
                if (count == 10) break;
                else {
                    cnt++;
                    sheep = Integer.toString(num * cnt);
                }
            }
            System.out.printf("#%d %s", tc, sheep);
        }
    }
}
