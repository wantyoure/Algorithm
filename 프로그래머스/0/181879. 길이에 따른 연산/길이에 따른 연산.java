import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 1;
        for(int i=0; i<num_list.length; i++) {
                if(num_list.length >= 11)  {
                    answer += num_list[i];  
                } else {
                    result *= num_list[i];
                    answer = result;
                    System.out.print(answer);
                }
        }
        return answer;
    }
}