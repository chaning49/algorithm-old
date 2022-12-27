import java.util.Scanner;
import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String word = sc.next();
            int chk = 0;

            // 입력받은 단어의 오름차순으로 원소 하나씩 배열에 저장 후 오름차순 배열 크기만큼 내림차순 전용 배열 생성
            String[] wordSplit = word.split("");
            String[] reverseWord = new String[wordSplit.length];

            // 오름차순으로 입력된 단어를 내림차순으로 하나씩 배열에 저장
            for (int j = 0; j < wordSplit.length; j++) {
                reverseWord[wordSplit.length - j - 1] = wordSplit[j];
            }

            // 오름차순, 내림차순 배열을 String으로 바꿔준다.
            String tempAsc = Arrays.toString(wordSplit);
            String tempDesc = Arrays.toString(reverseWord);

            // 만약 같으면 chk를 1로 바꿔준다.
            if (tempAsc.equals(tempDesc)) chk = 1;

            // 정답 출력
            System.out.printf("#%d %d\n", test_case, chk);
        }
    }
}