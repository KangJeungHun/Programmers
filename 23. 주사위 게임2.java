class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int sum = a + b + c;
        int power_2 = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int power_3 = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        
        if(a != b && b != c && c != a){
            answer = sum;
        }else if(a == b && b == c){
            answer = sum*power_2*power_3;
        }else{
            answer = sum*power_2;
        }
            
        return answer;
    }
}
