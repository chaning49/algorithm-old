import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        // db에 있는 배열을 하나씩 순회하면서 id가 같은지 확인한 후
        // 같으면 pw도 같은지 확인한다.
        for (String[] d : db) {
            if (d[0].equals(id_pw[0])) {
                if (d[1].equals(id_pw[1])) return "login";
                else return "wrong pw";
            }
        }
        // for문에서 return되지 않았다면 없는 것이므로 fail 반환
        return "fail";
    }
}
