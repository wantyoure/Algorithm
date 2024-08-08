class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 ="";
        String num2 ="";
        int num3 = 0;
        int result = 0;
        num1 = String.valueOf(a);
        num2 = String.valueOf(b);
        num1 += num2;
        result = Integer.valueOf(num1);
        num3 = 2 * a * b;
        answer = Math.max(result,num3);
        if(result == num3) {
            answer = result;
        }
        return answer;
      }
    }
