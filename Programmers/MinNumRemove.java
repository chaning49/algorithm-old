import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        // 만약 배열에 하나의 원소만 존재하면 -1을 담아 리턴
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        // 배열에 원소가 2개 이상인 경우
        else {
            // 배열의 크기보다 하나 작은 크기를 할당
            answer = new int[arr.length - 1];
            // 최소값을 구하기 위해 첫 번째 값을 할당
            int minNum = arr[0];
            // 배열을 순회하면서 최소값 찾기
            for (int i = 1; i < arr.length; i++) {
                minNum = Math.min(minNum, arr[i]);
            }
            // answer 배열의 인덱스로 사용할 idx 선언
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                // 최소값과 같은 값은 패스
                if (minNum == arr[i]) continue;
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}