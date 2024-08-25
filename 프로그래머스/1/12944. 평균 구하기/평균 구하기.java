class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        return answer = (double) sum / arr.length;
    }
}

//길이 나누기 그리고 숫자들 더하기 