import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        // 이전에 등장한 단어나 이전 단어의 끝 글자와 현재 단어의 시작 글자가 다른 경우를 체크해주는 변수 선언
        boolean chk = true;
        // 사용된 단어를 저장할 리스트 만들기
        List<String> list = new ArrayList<>() {};
        // words.length 만큼의 반복문 작성
        for (int i = 0; i < words.length; i++) {
            // i가 0보다 크면서 이전 단어의 끝 글자와 현재 단어의 시작 글자가 다르거나 이전에 등장한 단어라면 실행된다.
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0) || list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                chk = false;
                break;
            }
            list.add(words[i]);
        }
        // chk가 true인 경우 [0, 0] 리턴
        if (chk) return new int[] {0, 0};
        return answer;
    }
}