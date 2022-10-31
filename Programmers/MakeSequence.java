import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // emergency에 있는 숫자가 다른 숫자보다 작다면 순위는 +1
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}