
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            answer += Character.isUpperCase(c)
                    ? Character.toLowerCase(c)
                    : Character.toUpperCase(c);
        }

        System.out.println(answer);
    }
}
