import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        // quiz 배열 크기만큼 배열 할당
        String[] answer = new String[quiz.length];

        // quiz의 문자열을 하나씩 순회하면서 split(" ")으로 나누어 저장한 뒤에
        // 항상 두번째 원소에 위치한 연산자를 switch-case 문으로 가져가서 연산을 실행한다.
        // 그 후에 답이 맞는지 아닌지 여부에 따라 "O", "X"를 answer 배열에 삽입
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[2]);
            int z = Integer.parseInt(temp[4]);
            // 뺄셈인 경우
            if (temp[1].equals("-")) {
                if (x - y != z) answer[i] = "X";
                else answer[i] = "O";
            }
            // 덧셈인 경우
            if (temp[1].equals("+")) {
                if (x + y == z) answer[i] = "O";
                else answer[i] = "X";
            }

        }
        return answer;
    }
}