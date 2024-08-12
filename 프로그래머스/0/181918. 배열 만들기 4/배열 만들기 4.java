import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer>stk = new ArrayList<>();
        int i=0;
        while(i < arr.length) {
           if(stk.size() == 0) {
               stk.add(arr[i]); //1추가 
               i=i+1;
               
            } 
             else{
                int last=stk.get(stk.size()-1);
                if(stk.size()!=0 && last<arr[i]){
                stk.add(arr[i]);
                i=i+1;
                }
                else if(stk.size()!=0 && last>=arr[i]){
                    stk.remove(stk.size()-1);
                }
              }
            }
            
        return stk;
        
    }       
}
//만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
// 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다. 이건 그냥 for문 만들면 되는거고
//whlie은 조건문이 있을때 쓰는 거구나 그리고 list.size는 그냥 만약[1,2,3] 이렇게 있으면 3을 반환 하니까 
//근데 인덱스로 접근을 하면 0,1,2 이러니까 즉 3은 list.size-1을 해줘야지 접근할 수 있음