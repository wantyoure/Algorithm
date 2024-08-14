import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int poket = nums.length / 2 ; // 2가 들어있음
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }        
                
        return set.size() > poket ? poket : set.size();
    }
}

// 3이 들어있음 

