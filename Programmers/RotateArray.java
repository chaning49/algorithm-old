class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        // 왼쪽으로 한 칸 움직이는 경우
        // numbers의 두번째부터 끝까지의 값이 answer의 첫번째부터 number의 길이 - 1까지 위치하고
        // numbers의 맨 앞에 있는 값이 맨 뒤로 간다.
        if (direction.equals("left")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }
            answer[numbers.length - 1] = numbers[0];
        }

        // 오른쪽으로 한 칸 움직이는 경우
        // numbers의 첫번째부터 numbers의 길이 - 1까지의 값이 answer의 두번째부터 끝까지 위치하고
        // numbers의 맨 뒤에 있는 값이 맨 앞으로 간다.
        if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[numbers.length - 1];
        }

        return answer;
    }
}