import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        // 부서의 개수를 세는 변수
        int answer = 0;
        // 부서별 신청 금액을 오름차순으로 정렬
        Arrays.sort(d);
        // 예산이 남아있는 동안 반복문 순회
        for (int i = 0; i < d.length; i++) {
            // 예산이 특정 부서의 신청 금액보다 크거나 같다면 예산에서 빼주고, 부서의 개수 증가
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            }
            // 예산이 작아지면 바로 반복문을 빠져나온다.
            else break;
        }

        return answer;
    }
}