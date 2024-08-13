class Solution {
    public String solution(String n_str) {
        String answer = "";
        answer = n_str.replaceFirst("^0+","");
        return answer;
    }
}
//가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return 
// 