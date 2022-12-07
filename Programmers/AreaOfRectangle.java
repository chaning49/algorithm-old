class Solution {
    public int solution(int[][] dots) {
        int maxX = -256;
        int minX = 256;
        int maxY = -256;
        int minY = 256;

        // x좌표 중 큰 값과 작은 값, y좌표 중 큰 값과 작은 값을 구해준다.
        for(int i = 0; i < dots.length; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minY = Math.min(minY, dots[i][1]);
        }

        // x와 y끼리 연산을 한 결과를 곱하면 넓이가 나온다.
        return (maxX - minX) * (maxY - minY);
    }
}