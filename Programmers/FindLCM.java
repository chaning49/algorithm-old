import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        // 배열의 가장 큰 수 저장
        int max = arr[arr.length - 1];

        // 1부터 최소공배수가 나올때까지 곱할 수 i
        int i = 1;

        // max의 값에 1부터 최소공배수가 나올 때까지 반복문 순회
        while (true) {
            int cnt = 0;
            int temp = max * i;
            // 배열의 모든 원소로 temp를 나눴을 때, 나머지가 있으면 break, 아니면 cnt 증가
            for (int j = 0; j < arr.length - 1; j++) {
                if (temp % arr[j] != 0) break;
                cnt++;
            }

            // cnt가 배열의 길이 - 1이라는 것은 맨 마지막 수를 뺀 나머지 배열에서 모두 나누어 떨어졌다는 뜻이다.
            if (cnt == arr.length - 1) {
                max = temp;
                break;
            }
            i++;
        }
        return max;
    }
}