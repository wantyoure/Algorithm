import java.util.*;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0; i<control.length(); i++) {
            if(control.charAt(i) == 'w') { 
                n += 1;
            } else if(control.charAt(i) == 's') {
                n -= 1;
            } else if(control.charAt(i) == 'd') {
                n += 10;
            } else if(control.charAt(i) == 'a') {
                n -= 10;
            }
        }
        return answer = n;
    }
}

// char은 ''로 확인 할 수 있기 때문에 ""로 하면 스트링이므로 비교가 안 된다.