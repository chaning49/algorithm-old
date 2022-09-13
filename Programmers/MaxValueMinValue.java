import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 1. 공백을 기준으로 문자열을 잘라서 String 배열에 삽입한다.
        // 2. 배열을 정렬한 후 최대와 최소 값을 String 형태로 리턴
        String[] answer = s.split(" ");
        String ans = ""; // String 변수 생성
        int[] toInt = new int[answer.length]; // 대소 비교를 위해answer를 int형 배열로 담는다.

        for (int i = 0; i < answer.length; i++) { // int형 배열에 하나씩 값 삽입
            toInt[i] = Integer.parseInt(answer[i]);
        }
        Arrays.sort(toInt); // 오름차순 정렬
        ans += Integer.toString(toInt[0]); // 최소값
        ans += " ";
        ans += Integer.toString(toInt[toInt.length - 1]); // 최대값
        return ans;
    }
}

