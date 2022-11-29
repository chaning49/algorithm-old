import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 앞에서부터 비교하기 위해 sort
        Arrays.sort(phone_book);

        // 앞 뒤에 위치한 문자열끼리 비교해서 이전 문자열로 시작하면 false 반환
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        // 전체 경우를 다 순회하고도 false가 아니었다면 true
        return true;
    }
}