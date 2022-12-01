import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp = 100;

        // 입력되는 테스트케이스가 항상 오름차순은 아니기 때문에 정렬해준다.
        Arrays.sort(array);

        // 차이가 작은 숫자를 저장해야 하므로 배열에 있는 수를 저장하고, 배열값 - n 값도 따로 저장한다.
        for (int a : array) {
            if (Math.abs(a - n) < temp) {
                answer = a;
                temp = Math.abs(a - n);
            }
        }

        return answer;
    }
}