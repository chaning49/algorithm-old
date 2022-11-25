package com.codestates.coplit;

public class Solution {
    public int LSCS(int[] arr) {
        // TODO:
        int arrSubSum = 0;
        // 음수 값이 포함되기 때문에 최대한 작은 음수를 할당.
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            arrSubSum += arr[i];
            if(arrSubSum > max) max = arrSubSum;

            // 연속된 구간의 합이 음수인 경우,
            // 해당 부분은 버리고 다시 시작해도 된다.
            if (arrSubSum < 0) {
                arrSubSum = 0;
            }
        }

        return max;
    }
}