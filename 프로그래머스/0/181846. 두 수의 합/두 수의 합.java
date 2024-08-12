import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
       BigInteger result1 = new BigInteger(a); // 문자열로부터 BigInteger 생성
       BigInteger result2 = new BigInteger(b);
       BigInteger result3 = result1.add(result2);
        answer = result3.toString();
        return answer;
    }
}