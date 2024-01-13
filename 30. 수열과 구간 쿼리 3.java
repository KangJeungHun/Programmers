class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i<queries.length; i++){
            int index0 = queries[i][0]; // 바꿔질 arr의 index
            int index1 = queries[i][1]; // 바꿀 arr의 index
            int temp = arr[index0]; // 원래 값
            
            arr[index0] = arr[index1]; 
            arr[index1] = temp;
        }
        return arr;
    }
}
