class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String MyStr01 = my_string.substring(0,s);
        String MyStr02 = my_string.substring((s+overwrite_string.length()), my_string.length());
        String answer = MyStr01 + overwrite_string + MyStr02;
        
        return answer;
    }
}
