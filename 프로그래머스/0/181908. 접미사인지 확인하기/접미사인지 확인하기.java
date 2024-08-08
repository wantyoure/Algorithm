import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
      List<String> list = new ArrayList<>();
        int answer = 0;

        // 모든 접미사를 리스트에 추가합니다.
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }

        // 리스트를 정렬합니다.
        Collections.sort(list);

        // 접미사 리스트에 is_suffix가 포함되어 있는지 확인합니다.
        if (list.contains(is_suffix)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}