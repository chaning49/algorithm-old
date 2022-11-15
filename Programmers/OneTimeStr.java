class Solution {
    public String solution(String s) {
        // 알파벳의 개수를 저장할 배열 생성
        int[] alphabet = new int[26];

        String answer = "";

        // 입력받은 문자열을 하나씩 따로 저장한다.
        String[] sArr = s.split("");

        // 문자열을 순회하면서 알파벳이 존재하면 해당 위치의 알파벳 개수 증가
        for (String str: sArr) {
            int idx = str.charAt(0) - 'a';
            alphabet[idx]++;
        }

        // 알파벳의 개수가 1인 경우에만 문자열에 이어붙인다.
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == 1) {
                answer += Character.toString(i + 'a');
            }
        }

        return answer;
    }
}