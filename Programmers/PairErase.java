import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        // String s를 배열로 변환
        String[] arr = s.split("");

        // 같은 알파벳이 들어오는지 검사할 빈 스택 생성
        Stack<String> stack = new Stack<> ();

        // 스택에 첫 번째 값 push
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            // 만약 비어있다면 스택에 push하고 다음 인덱스로 넘어간다.
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }
            // 스택의 마지막 값이 arr[i]와 같다면 같은 값이므로 pop
            if (stack.peek().equals(arr[i])) stack.pop();
                // 다르다면 arr[i]를 스택에 push
            else stack.push(arr[i]);
        }
        return stack.size() ==0 ? 1 : 0;
    }
}