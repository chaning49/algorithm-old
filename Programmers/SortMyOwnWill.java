import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        // 순서를 저장할 리스트 생성
        List<String> list = new ArrayList<> ();

        // strings의 원소에 n번 인덱스에 해당하는 문자를 붙여서 저장한다.(정렬을 위해서)
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]); // usun, ebed, acar
        }

        // 리스트 오름차순 정렬
        Collections.sort(list);

        // 맨 앞에 있는 원소를 제거하여 answer배열에 삽입
        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
}