class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        // 문자열의 길이를 체크하여 길이가 4나 6이 아니면 false
        if (s.length() != 4 && s.length() != 6) return false;
        // 반복문에서 하나씩 숫자가 나오는지 체크
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) continue;
            else {
                answer = false;
                break;
            }
        }
        return answer;
    }
}