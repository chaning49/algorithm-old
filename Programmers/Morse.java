import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";

        // 알파벳과 대치되는 모스 부호 배열
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        // 공백을 기준으로 문자열을 나눠서 저장
        String[] findLetter = letter.split(" ");

        // 모스부호에 해당하는 알파벳의 인덱스 + a를 char형으로 문자열에 붙이면 원하는 알파벳대로 입력된다.
        for (String l : findLetter) {
            answer += (char) (Arrays.asList(morse).indexOf(l) + 'a');
        }

        return answer;
    }
}