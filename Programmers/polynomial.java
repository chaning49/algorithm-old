import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int x = 0, num = 0;

        // 띄어쓰기를 기준으로 저장
        String[] polyArr = polynomial.split(" ");

        for (String s : polyArr) {
            // + 연산자는 무시한다.
            if (s.equals("+")) continue;
            // x가 포함되는 경우 x인지 x 앞에 숫자가 있는지를 판별해서 x의 인덱스를 증가
            if (s.contains("x")) {
                if (s.length() == 1) {
                    x += 1;
                } else {
                    x += Integer.parseInt(s.substring(0, s.length() - 1));
                }
                // 일반 숫자의 경우 더한다.
            } else {
                num += Integer.parseInt(s);
            }

        }

        // x와 num이 모두 0인 경우는 입력으로 0이 들어온 경우 밖에 없다.
        if (x == 0 && num == 0) {
            return "0";
        } else if (x != 0 && num == 0) { // x값이 존재하고 num이 0인 경우는 x의 길이에 따라 출력을 다르게 한다.
            if (x == 1) return "x";
            else return x + "x";
        } else if (x == 0 && num != 0) { // num 값에 따라 String으로 변환해준다.
            return Integer.toString(num);
        } else { // x의 인덱스에 따라 출력문을 다르게 설정한다.
            if (x == 1) {
                return "x + " + Integer.toString(num);
            } else {
                return Integer.toString(x) + "x + " + Integer.toString(num);
            }
        }
    }
}