import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 테스트 케이스의 개수 t 입력받기
        // 2. 반복 횟수와 반복할 문자열 String 배열로 한 줄에 입력받기
        // 3. 따로 변수에 저장해준다.
        // 4. for문을 문자열의 길이만큼 순회하면서 r회씩 출력해주는 이중 for문을 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");

            int r = Integer.parseInt(str[0]);
            String s = str[1];

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}