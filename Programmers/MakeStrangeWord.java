class Solution {
    public String solution(String s) {
        String answer = "";
        // 단어별로 저장할 배열 생성, -1이 있으면 맨 끝에 오는 공백도 저장한다.
        String[] arr = s.split(" ", -1);
        // 반복문으로 단어 하나씩 순회
        for (String str : arr) {
            for (int i = 0; i < str.length(); i++) {
                // 단어 하나를 임시 저장
                String tmp = Character.toString(str.charAt(i));
                // 단어의 인덱스가 짝수이면 대문자로 변경
                if (i % 2 == 0) tmp = tmp.toUpperCase();
                // 단어의 인덱스가 홀수이면 소문자로 변경
                if (i % 2 != 0) tmp = tmp.toLowerCase();
                answer += tmp;
            }
            if (arr[arr.length - 1] != str) answer += " ";
        }
        return answer;
    }
}