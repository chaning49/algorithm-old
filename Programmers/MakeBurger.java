// 내가 짠 코드
import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack.push(i);
            cnt++;
            if (cnt >= 4 && stack.get(cnt - 1) == 1
                    && stack.get(cnt - 2) == 3
                    && stack.get(cnt - 3) == 2
                    && stack.get(cnt - 4) == 1) {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                cnt -= 4;
                answer++;
            }
        }
        return answer;
    }
}

// 좋은 코드
class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                    && stack[sp - 2] == 3
                    && stack[sp - 3] == 2
                    && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
}