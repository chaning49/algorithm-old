package com.codestates.coplit;

public class Solution {
    public static int[] radixSort(int[] arr) {
        // TODO:
        int len = arr.length;

        // max 값부터 찾는다.
        int max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, arr[i]);

        }

        for (int digit = 1; (max / digit) > 0; digit *= 10) {
            arr = countSort(arr, len, digit);
        }

        return arr;
    }

    // 계수 정렬
    public static int[] countSort(int[] arr, int len, int digit) {
        // 데이터의 위치를 옮기기 위해 임시로 사용한다.
        int[] temp = new int[len];
        int[] count = new int[10];

        // 자릿수별로 계수 증가
        for (int i = 0; i < len; i++) {
            count[(arr[i] / digit) % 10]++;
        }

        // 자리 변경을 위한 temp의 인덱스 설정, count 배열 크기만큼의 누적합을 저장한다. 배열의 개수가 최대값이다.
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 자리를 바꾸기 위해 뒤에서부터 순회(뒤에서부터 정렬하는 것이 안정적이다.)
        for (int i = len - 1; i >= 0; i--) {
            // 각 기수(자릿수)에 맞는 값을 countValue라고 한다.
            int countValue = (arr[i] / digit) % 10;
            // 계수를 세어 놓은 count 배열에서 countValue에 해당하는 인덱스의 개수를 찾아 -1 한 값을 저장
            // (-1 하는 이유는 배열의 인덱스가 0부터 시작하니까!)
            count[countValue]--;
            // temp의 newIdx 자리에 뒤에서부터 순차적으로 arr의 값을 삽입한다.(정렬을 위한 자리 재배치)
            temp[count[countValue]] = arr[i];
        }
        return temp;
    }
}
