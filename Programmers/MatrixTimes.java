class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // n x m 행렬과 m x l 행렬을 곱하면 n x l 행렬이 되므로 arr1의 행 개수와 arr2의 열 개수로 이루어진 2차원 배열을 생성한다.
        int[][] answer = new int[arr1.length][arr2[0].length];

        // arr1과 arr2의 원소를 하나씩 순회해야 하므로 우선 2중 for문을 작성했다.
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                int temp = 0;
                // temp에 행렬의 곱셈 순서대로 곱해서 더해준다.
                for(int k = 0; k < arr2.length; k++) {
                    temp += arr1[i][k] * arr2[k][j];
                }
                // 정답 배열 위치에 값을 넣는다.
                answer[i][j] = temp;
            }
        }

        return answer;
    }
}