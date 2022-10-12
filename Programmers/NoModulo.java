import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        // 값 추가를 위해 List 선언
        List<Integer> list = new ArrayList<> ();

        // 반복문으로 arr을 순회하면서 divisor로 나누어지는 수를 list에 추가
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        // 리스트가 빈 경우
        if (list.isEmpty()) {
            // answer에 -1 삽입
            answer = new int[1];
            answer[0] = -1;
        }
        // 리스트에 값이 있는 경우
        else {
            // 오름차순 정렬 후 배열로 옮겨준다.
            Collections.sort(list);
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        }
        return answer;
    }
}