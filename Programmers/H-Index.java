import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        // 논문의 수대로 정렬, 논문을 정렬하면 h 이하는 항상 만족한다.
        Arrays.sort(citations);

        // 논문의 개수 n부터 하나씩 줄여가면서 h를 만족하는 위치를 찾는다.
        for (int i = 0; i < citations.length; i++) {
            // 논문의 개수를 하나씩 줄인 값을 초기화
            int h = citations.length - i;
            // 해당 인덱스가 h-index 이상이라면 종료
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}