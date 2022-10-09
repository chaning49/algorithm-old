class Solution {
    public boolean solution(int x) {
        // x의 자릿수를 구하기 위해 String으로 변환해서 길이를 저장
        String xStr = Integer.toString(x);
        int xLen = xStr.length();

        // 하샤드 수 저장할 변수 생성
        int harshad = 0;

        // 자릿수를 구하기 위해 x 값 저장
        int cpy = x;

        // 반복문으로 자릿수를 더해준다.
        for (int i = xLen - 1; i > 0; i--) {
            harshad += cpy / Math.pow(10, i);
            cpy %= Math.pow(10, i);
        }
        // 일의 자리를 더해준다.
        harshad += cpy;

        return x % harshad == 0;
    }
}