class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str_a = String.valueOf(a);
        String str_b = String.valueOf(b);
        String sum = str_a + str_b;
        
        if(Integer.parseInt(sum) < 2 * a * b){
            answer = 2 * a * b;
        }else{
            answer = Integer.parseInt(sum);
        }
        return answer;
    }
}
