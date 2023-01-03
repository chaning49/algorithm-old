import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        // 소문자로 변환 후 문자열 배열로 만들어서 정렬
        my_string = my_string.toLowerCase();
        String[] temp = my_string.split("");
        Arrays.sort(temp);

        // 다시 문자열로 만들 때, 불필요한 문자들 제거
        answer = Arrays.toString(temp).replace("[", "").replace(", ","").replace("]", "");;

        return answer;
    }
}