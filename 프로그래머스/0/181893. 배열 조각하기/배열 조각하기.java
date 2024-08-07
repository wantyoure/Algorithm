import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i=0; i<query.length; i++) {
            if(i % 2 == 0) { //짝,홀,짝 총 3번 도니까 짝,홀,짝, 이렇게 진행할 수 있겠지?
                arr = Arrays.copyOfRange(arr,0,query[i]+1); //+1을 해야지만 그 뒤에 있는 배열을 자를 수 있어 
            }else
                arr = Arrays.copyOfRange(arr,query[i], arr.length);
            }
           return arr;
          }
     
        }               