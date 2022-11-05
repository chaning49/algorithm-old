import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        // 문자열 s를 띄어쓰기를 기준으로 문자열 배열인 arr에 저장
        String[] arr = s.split(" ");
        // 스택을 선언한다.
        Stack<String> stack = new Stack<> ();
        // 배열의 있는 값을 순회하면서 스택이 비어있지 않고, Z가 나오는 경우에만 stack에서 pop
        // 아닌 경우에는 stack에 문자열 a를 push한다.
        for (String a : arr) {
            if (!stack.isEmpty() && a.equals("Z")) stack.pop();
            else {
                stack.push(a);
            }
        }

        // 스택에 있는 값을 하나씩 꺼내면서 숫자로 바꿔 더한다.
        while (!stack.isEmpty()) {
            answer += Integer.parseInt(stack.pop());
        }

        return answer;
    }
}