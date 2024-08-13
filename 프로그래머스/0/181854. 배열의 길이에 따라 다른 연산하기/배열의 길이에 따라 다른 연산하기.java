import java.util.*;

class Solution {
    public List solution(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
             if(arr.length % 2 == 1) {  
                 for(int i=0; i<arr.length; i++) {
                    if(i % 2 == 0) {
                        list.add(arr[i] + n);
                    } else {
                        list.add(arr[i]);
                    }
                }
            } else {
                   if(arr.length % 2 == 0) {
                    for(int j=0; j<arr.length; j++) {
                    if(j % 2 == 1) {
                        list.add(arr[j] + n);
                    }else {
                        list.add(arr[j]);
                     }
                   }
                 }
               }
            //모든 짝수 인덱스 위치를 어떻게 표현하지?
            
        

        return list;
    
    }
}

//System.out.print(list.add(arr[i] + n));