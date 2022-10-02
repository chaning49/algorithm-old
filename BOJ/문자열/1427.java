import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 배열의 형태로 입력받기
        String[] arr = br.readLine().split("");
        // 정답으로 반환할 빈 문자열
        String ans = "";
        // Wrapper 클래스 형태로 선언하면 reverseOrder를 사용할 수 있으므로 역순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        // ans에 배열 요소 하나씩 추가
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}