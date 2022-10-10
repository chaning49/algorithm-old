import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        // 문자열 배열에 하나씩 잘라서 저장
        String[] arr = Long.toString(n).split("");
        // 역순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        // answer에 하나씩 concat
        for (String a : arr) answer += a;
        // long으로 변환해서 반환
        return Long.parseLong(answer);
    }
}