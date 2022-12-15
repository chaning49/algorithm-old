class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxNum = 0;

        // array의 최댓값을 구해서 저장
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) maxNum = array[i];
        }

        // array의 최댓값 + 1 크기의 배열 생성
        int[] check = new int[maxNum + 1];

        // array에 해당하는 인덱스에 위치한 값을 증가
        for (int a : array) {
            check[a]++;
        }

        // 최빈값을 구해서 저장하고, 정답에 해당하는 값을 저장
        int checkMax = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i] > checkMax) {
                checkMax = check[i];
                answer = i;
            }
        }

        // 최빈값의 개수를 체크하는 반복문, rep가 1을 넘는 순간 최빈값이 여러 개이므로 -1 리턴
        int rep = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i] == checkMax) {
                rep++;
                if (rep > 1) return -1;
            }
        }

        return answer;
    }
}