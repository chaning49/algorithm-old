import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        // char형 배열로 나눠서 저장(정렬을 위해서)
        char[] charBf = before.toCharArray();
        char[] charAf = after.toCharArray();

        // 오름차순으로 똑같이 정렬
        Arrays.sort(charBf);
        Arrays.sort(charAf);

        // String으로 붙여준다.
        String strBf = new String(charBf);
        String strAf = new String(charAf);

        // 비교해서 같으면 1, 다르면 0
        if (strBf.equals(strAf)) return 1;
        else return 0;
    }
}