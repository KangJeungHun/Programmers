class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str_a = String.valueOf(a); // String.valueOf(int) : int를 string으로 형변환
        String str_b = String.valueOf(b);
        String sum_a = str_a + str_b;
        String sum_b = str_b + str_a;
        
        if(Integer.parseInt(sum_a) < Integer.parseInt(sum_b)){ // Integer.parseInt(str) : string을 int로 형변환
            answer = Integer.parseInt(sum_b);
        }else{
            answer = Integer.parseInt(sum_a);
        }
        return answer;
    }
}
