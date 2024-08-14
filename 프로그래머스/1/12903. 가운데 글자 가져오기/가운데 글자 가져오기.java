class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            if(s.length() % 2 == 0){
                answer = String.valueOf(s.charAt(s.length()/2 -1) );
                answer += String.valueOf(s.charAt(s.length()/2));
                
                System.out.print(answer);
            } else {
                answer = String.valueOf(s.charAt(s.length()/2));
                System.out.print(answer);
            }
        }
        return answer;
    }
}
//어떻게 가운데 부분을 알 수 있을까?
// s 길이의 절반을 가지고 오면 알 수 있지 않을까?