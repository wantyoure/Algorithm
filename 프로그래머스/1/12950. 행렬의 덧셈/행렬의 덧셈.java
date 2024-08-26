class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        
        int[][] result = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }
}

//[[1,2][2,3]]
//[[3,4][5,6]]