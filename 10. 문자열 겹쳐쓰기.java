class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String MyStr01 = my_string.substring(0,s); // 문자열 my_string의 0~s번째 인덱스까지를 MyStr01에 따로 저장
        String MyStr02 = my_string.substring((s+overwrite_string.length()), my_string.length()); // 겹쳐쓴 이후의 인덱스부터 원래 my_string의 마지막 인덱스까지의 문자열을 MyStr02에 저장
        String answer = MyStr01 + overwrite_string + MyStr02;
        
        return answer;
    }
}
