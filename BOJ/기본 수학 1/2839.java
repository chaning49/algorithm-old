import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (n % 5 == 0) { // 5로 나누어 떨어지면 봉투의 최소 개수
                System.out.println(cnt + n / 5);
                break;
            } else { // 5로 나누어 떨어지지 않으면 3을 배주고 봉투 개수를 증가
                n -= 3;
                cnt++;
            }

            if (n < 0) { // 빼다가 음수가 되면 -1
                System.out.println(-1);
                break;
            }
        }
    }
}