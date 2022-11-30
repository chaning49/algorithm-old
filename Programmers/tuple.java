import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        // 중괄호를 모두 제거한 다음 ,를 기준으로 String 배열로 만든다.
        s = s.replace("{", "").replace("}", "");
        String[] arr = s.split(",");

        for (String a : arr) {
            map.compute(a, (k, v) -> (v == null) ? 1 : v + 1);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

        int[] answer = new int[keySet.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(keySet.get(i));
        }

        return answer;
    }
}