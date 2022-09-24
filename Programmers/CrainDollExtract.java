import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][i - 1]);
                    }
                    else if (stack.peek() == board[j][i - 1]) {
                        stack.pop();
                        answer += 2;
                    }
                    else stack.push(board[j][i - 1]);
                    board[j][i - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}