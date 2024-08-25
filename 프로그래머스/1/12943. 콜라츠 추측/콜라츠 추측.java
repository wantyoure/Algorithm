class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2 ;
            } else {
                num = (num * 3) + 1;
            } 
            if (answer >= 500) {
            answer = -1; // 500번을 넘으면 -1을 반환
            break;
            }
            answer ++;
        }
        return answer;
    }
}