import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        // 합을 저장하기 위한 리스트 생성
        List<Integer> list = new ArrayList<> ();

        // 반복문을 순회하면서 합을 저장한다.
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) list.add(sum);
            }
        }

        // list 정렬
        Collections.sort(list);

        // answer 배열의 크기를 리스트 크기만큼 할당
        answer = new int[list.size()];

        // answer 배열에 리스트 원소를 삽입
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}