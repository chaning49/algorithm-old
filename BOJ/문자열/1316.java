import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int[] alpha = new int[26]; // 알파벳이 사용된 적이 있는지 확인하는 배열
            boolean chk = true; // 그룹 단어 체크

            for (int j = 0; j < str.length(); j++) {
                int idx = str.charAt(j) - 'a'; // 알파벳의 인덱스 뽑아내기 str.charAt()이 a라면 idx는 0이고, 배열에서 첫번째 값과 대치된다.
                if (alpha[idx] != 0) { // 알파벳 배열이 사용된 적 있고
                    if (str.charAt(j) != str.charAt(j - 1)) { // 이전 알파벳과 현재 알파벳이 다르면
                        chk = false; // 그룹 단어가 아니다.
                        break;
                    }
                } else alpha[idx]++; // 이전 알파벳과 현재 알파벳이 같다면 그룹단어이므로 증가
            }
            if (chk) cnt++; // 전체 개수 증가
        }
        System.out.println(cnt);
    }
}