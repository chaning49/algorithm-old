// 내 코드
import java.util.*;

class Solution {
    public long solution(String numbers) {
        // replace + indexOf 사용해보자
        long answer = 0;
        // 리스트에 0부터 9까지의 수를 저장
        ArrayList<String> numList = new ArrayList<> (Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        // 리스트에 있는 알파벳은 인덱스와 대응되므로 문자열 형태의 아라비아 숫자로 변경
        for (int i = 0; i < 10; i++) {
            String check = numList.get(i);
            int idx = numList.indexOf(check);
            numbers = numbers.replace(check, Integer.toString(idx));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}

// 깔끔한 코드
class Solution {
    public long solution(String numbers) {
        // 배열에 0부터 9까지의 알파벳을 저장
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // valueOf를 이용해서 String 형태의 아라비아 숫자로 변경
        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }
}