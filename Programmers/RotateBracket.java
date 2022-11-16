import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String rotate = s;
        for (int i = 0; i < s.length(); i++) {
            if (checkStr(rotate)) answer++;
            rotate = rotate.substring(1, s.length()) + rotate.charAt(0);
        }

        return answer;
    }

    public boolean checkStr(String s) {
        // 스택을 생성해서 괄호의 짝을 맞춰준다.
        Stack<Character> stk = new Stack<> ();
        // 스택이 비어있으면 첫 번째 값을 일단 넣어준다.
        for (int i = 0; i < s.length(); i++) {
            if (stk.isEmpty()) stk.push(s.charAt(i));
            else {
                // 닫는 괄호가 나왔을 때, 스택의 마지막 원소가 모양이 같은 여는 괄호면 pop
                // 아닌 경우는 이미 올바른 괄호 문자열이 아니므로 false를 반환
                if (s.charAt(i) == ')') {
                    if (stk.peek() == '(') stk.pop();
                    else return false;
                } else if (s.charAt(i) == '}') {
                    if (stk.peek() == '{') stk.pop();
                    else return false;
                } else if (s.charAt(i) == ']') {
                    if (stk.peek() == '[') stk.pop();
                    else return false;
                } else stk.push(s.charAt(i)); // 여는 괄호는 무조건 스택에 삽입
            }
        }
        // 빈 스택에 닫는 괄호가 들어간 경우를 방지하기 위해서 스택이 비었는지 확인하여 결과를 전달한다.
        if (stk.isEmpty()) return true;
        else return false;
    }
}