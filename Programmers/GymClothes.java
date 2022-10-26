import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        // TC 13, 18번에서 문제가 생기는 부분
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer += 1;
                    lost[i] = -1000;
                    reserve[j] = -1000;
                    break;
                }
            }
        }

        // lost의 값을 하나씩 꺼내와서 reserve에 있는 값과 비교 했을 때, 차이가 1인지 확인
        for (int l : lost) {
            for (int j = 0; j < reserve.length; j++) {
                int temp = l - reserve[j];
                if (Math.abs(temp) == 1) {
                    answer += 1;
                    reserve[j] = -1;
                    break;
                }
            }
            System.out.println(Arrays.toString(reserve));
        }

        return answer;
    }
}