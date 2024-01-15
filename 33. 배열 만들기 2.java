import java.util.ArrayList; 

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>(); // int[] 로 배열 만들면 고정이므로 ArrayList 사용
        
        for(int i = l; i <= r; i++){
            String numString = Integer.toString(i);
            boolean found = true;
            
            for(int j = 0; j<numString.length(); j++){
                char digit = numString.charAt(j);
                
                if(digit != '0' && digit != '5'){
                    found = false;
                    break;
                }
            }
            
            if (found){
                answer.add(i); // 정답 리스트에 추가
            }
        }
        return answer.isEmpty() ? new int[]{-1} : answer // 비었으면 -1 담기
            .stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
