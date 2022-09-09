import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferReader 입력받기

        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 입력 받는다

        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp < min) min = temp;
            if (temp > max) max = temp;
        }
        System.out.print(min + " " + max);
    }
}

