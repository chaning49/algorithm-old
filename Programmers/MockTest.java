import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        // 수포자 1, 2, 3의 패턴을 배열에 저장
        int[] supoOne = {1, 2, 3, 4, 5};
        int[] supoTwo = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 수포자가 맞춘 정답의 개수를 저장
        int ansOne = 0;
        int ansTwo = 0;
        int ansThree = 0;

        // 수포자 패턴 개수로 i값을 나눠줘서 패턴 안에서만 비교한다.
        for (int i = 0; i < answers.length; i++) {
            if (supoOne[i % supoOne.length] == answers[i]) ansOne++;
            if (supoTwo[i % supoTwo.length] == answers[i]) ansTwo++;
            if (supoThree[i % supoThree.length] == answers[i]) ansThree++;
        }

        // 최대값 저장
        int max = Math.max(Math.max(ansOne, ansTwo), ansThree);

        // max와 맞춘 개수가 같은 수포자의 번호 저장
        ArrayList<Integer> list = new ArrayList<> ();
        if (ansOne == max) list.add(1);
        if (ansTwo == max) list.add(2);
        if (ansThree == max) list.add(3);

        // max와 일치하는 수포자의 수만큼 배열을 생성
        answer = new int[list.size()];

        // 정답 배열에 값 삽입
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}