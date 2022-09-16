// 1. 띄어쓰기를 기준으로 한 배열로 변환한 후에
// 2. 맨 앞글자가 알파벳인지만 확인하고 toUpperCase()
// 3. 나머지 글자들은 소문자로 변환
// 4. 다시 String으로 변환

class Solution {
    public String solution(String s) {
        String ans = "";
        String[] arr = s.toLowerCase().split("");
        boolean isFirst = true;

        for (String str : arr) {
            if (isFirst) ans += str.toUpperCase();
            else ans += str;
            isFirst = str.equals(" ");
        }
        return ans;
    }
}