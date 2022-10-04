import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // nums의 개수 / 2를 변수에 저장
        int count = nums.length / 2;

        // nums를 Set에 저장
        Set<Integer> numSet = new HashSet<Integer> ();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        // count보다 Set이 크다면 count가 최대값이므로 count 만큼만 선택할 수 있고, 그 미만은 Set의 크기만큼만 선택한다.
        answer = numSet.size() >= count ? count : numSet.size();
        return answer;
    }
}