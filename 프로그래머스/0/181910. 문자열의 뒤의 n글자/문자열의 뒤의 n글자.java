import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n); //뒤에서부터(bgin),  
        return answer;
    }
}