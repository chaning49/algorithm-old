import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < T + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 0;
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            if (m2 - m1 == 0) ans += d2 - d1 + 1;
            else {
                for (int k = m1; k < m2 - 1; k++) {
                    ans += days[k];
                }
                ans += d2 + (days[m1 - 1] - d1 + 1);
            }
            System.out.printf("#%d %d\n", i, ans);
        }

    }
}