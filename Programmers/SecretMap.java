import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String tmp = "";
            String str1 = Binary(n, arr1[i]);
            String str2 = Binary(n, arr2[i]);
            // 둘 중 하나의 원소라도 1이라면 #, 아니면 공백
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') tmp += "#";
                else tmp += " ";
            }
            answer[i] = tmp;
        }

        return answer;
    }
    // n 길이만큼의 자릿수를 가진 이진수
    public String Binary(int n, int arrNum) {
        String temp = Integer.toString(arrNum, 2);
        int len = temp.length();
        // 이진수로 변환한 길이가 n과 같다면 0을 앞에 붙일 필요가 없다.
        // 하지만 n보다 작다면 앞에 0을 모자란만큼 붙여준다.
        for (int i = 0; i < n - len; i++) temp = "0" + temp;
        return temp;
    }
}
