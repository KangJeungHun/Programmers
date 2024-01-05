import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char x;
        string answer = "";
        
        for(int i=0; i<a.length(); i++){
            x = a.charAt(i);
            if(Character.isUpperCase(x)){
                result+=Character.toLowerCase(x);
            }
            else {
                result+=Character.toUpperCase(x);
            }
        }
        System.out.println(answer);
    }
}
