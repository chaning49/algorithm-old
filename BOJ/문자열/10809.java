import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 알파벳만큼의 int 배열 생성 후 -1로 전체 초기화
        // 2. String 변수 s 입력받기
        // 3. s의 인덱스 - 'a'는 알파벳의 위치를 나타낸다. 'a'는 첫 번째이므로 0
        // 4. 여러 번 등장하는 단어는 처음 한 번만 체크할 수 있도록 배열 alpha의 알파벳 위치에 해당하는 값이 -1일 때만 값을 변경해준다.
        // 5. 값은 alpha[알파벳의 위치]에 i(s에 위치한 인덱스 값)을 삽입한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) alpha[i] = -1;

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            if (alpha[temp] == -1) alpha[temp] = i;
        }
        for (int n : alpha) System.out.print(n + " ");
    }
}