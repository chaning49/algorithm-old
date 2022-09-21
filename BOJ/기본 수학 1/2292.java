import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int limits = 1;

        // 벌집은 1, 2~7, 8~19 구간에서 6의 배수만큼 늘어난다.
        // n의 값이 들어왔을 때, 특정 범위 안에 속하면 최소 방문수는 그 범위 내에서 같다.
        while (n > limits) {
            limits += 6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}
