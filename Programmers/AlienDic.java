class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean check = false;

        // dic 내에 있는 단어를 모두 순회
        for (String d : dic) {
            check = false;
            String temp = d;

            for (String s : spell) {
                // spell에 있는 단어가 있으면 check를 true로 바꾸고, temp에 삽입한 단어에 있는 spell을 공백으로 바꿔준다.
                if (temp.contains(s)) {
                    check = true;
                    temp = temp.replace(s, "");
                } else { // 없으면 곧바로 반복문을 멈춘다.
                    check = false;
                    break;
                }
            }
            // check가 true이면 spell에 있는 알파벳이 모두 존재하는 경우이기 때문에 1 리턴
            if (check) return 1;
        }
        // 반복문에서 1이 리턴되지 않으면 2 리턴
        return 2;
    }
}