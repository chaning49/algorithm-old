class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[board.length];
        // 좌표 초기화
        int x = 0;
        int y = 0;

        // 보드의 끝 지점을 저장
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (String i : keyinput) {
            // 상, 하, 좌, 우 명령에 맞는 좌표 변경
            if (i.equals("left")) x -= 1;
            if (i.equals("right")) x += 1;

            if (i.equals("down")) y -= 1;
            if (i.equals("up")) y += 1;

            // 끝 지점을 벗어난 경우 끝 지점으로 좌표 수정
            if (x > xLimit) x -= 1;
            if (x < (-1) * xLimit) x += 1;
            if (y > yLimit) y -= 1;
            if (y < (-1) * yLimit) y += 1;
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}