class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = Integer.MAX_VALUE; // 초기 최솟값을 최댓값으로 설정
            boolean found = false; // 최솟값을 찾았는지 여부 판단
            
            for(int j = s; j <= e; j++){
                if(arr[j] > k && arr[j] < min){
                    min = arr[j];
                    found = true;
                }
            }
            if (found){
                answer[i] = min;
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}
