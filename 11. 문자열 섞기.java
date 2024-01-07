class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int length = str1.length(); // 두 문자열 길이가 같은 상황이라 가능
        
        for(int i=0; i<length; i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}
