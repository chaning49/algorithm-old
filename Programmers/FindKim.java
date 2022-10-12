class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        // 배열 seoul을 순회하면서 Kim을 찾는다.
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = Integer.toString(i);
                break;
            }
        }

        return "김서방은 " + answer + "에 있다";
    }
}