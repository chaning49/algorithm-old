import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // 문자열로 입력받기
        // 공백을 기준으로 잘라서 String 배열에 담고
        // 길이를 출력한다.
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringTokenizer ans = new StringTokenizer(word, " ");
        System.out.println(ans.countTokens());
    }
}