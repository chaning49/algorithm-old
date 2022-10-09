class Solution {
    boolean solution(String s) {

        // s를 소문자로 변경
        s = s.toLowerCase();

        // p와 y의 개수를 저장할 count 변수 선언
        int pCount = 0;
        int yCount = 0;

        // 반복문을 돌면서 p와 y의 개수를 증가시킨다.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') pCount++;
            if (s.charAt(i) == 'y') yCount++;
        }

        return pCount == yCount ? true : false;
    }
}