import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 배열로 저장
        String[] arr = s.split("");
        Arrays.sort(arr);
        // 역순으로 붙이기
        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }

        return answer;
    }
}