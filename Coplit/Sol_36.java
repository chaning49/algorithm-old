package com.codestates.coplit;

public class Solution {
    public int[] insertionSort(int[] arr) {
        // TODO:
        // 배열 전체를 순회하기 위해 길이를 저장
        int n = arr.length;
        // 외부 반복문은 for문으로 1부터 순회해야 첫 인덱스에서 2개의 원소를 비교할 수 있다.
        for (int i = 1; i < n; i++) {
            // key는 while 범위 내에 값과 비교하면서 값을 왼쪽으로 이동시킬 수 있게 한다.
            int key = arr[i];
            // i보다 한 칸 전 값을 j에 저장
            int j = i - 1;
            // j가 0보다 작으면 정렬된 상태의 배열을 모두 탐색한 것이므로 빠져나온다.
            // 또한 arr[j] 값이 key보다 큰 경우 바로 앞에 위치한 값과 swap한다.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 전체 다 돌고 나서 key가 들어갈 위치가 정해지므로 해당 위치에 key를 삽입한다.
            arr[j + 1] = key;
        }
        return arr;
    }
}
