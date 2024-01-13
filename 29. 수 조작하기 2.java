class Solution {
    public String solution(int[] numLog) {
        StringBuilder A = new StringBuilder();
        
        for(int i = 1; i<numLog.length; i++){
            switch (numLog[i] - numLog[i-1]){
                case 1 : A.append("w");
                    break;
                case -1 : A.append("s");
                    break;
                case 10 : A.append("d");
                    break;
                case -10 : A.append("a");
                    break;
            }
                
        }
        return A.toString();
    }
}
