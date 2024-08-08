class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 1;
        int sum = 0;
        for(int i=0; i<num_list.length; i++) {
          result *= num_list[i];
          sum += num_list[i]; 
          
          if(result < sum * sum) {
              answer = 1;
          } else {
              answer = 0;
          }
        }
      
        return answer;
    }
}

//모든 원소들을 곱하고, 모든 원소들의 합의 *2를 했을 때 
// 여기서 주의 점은 곱하기는 무조건 숫자 1이 있어야한다 0으로 되어 있으면 0을 곱하기 때문에 숫자가 아무것도 
//생기지 않는다.