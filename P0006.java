import java.util.*;

public class P0006 {
    // public String solution(String s) {
    //     String answer = "";
    //     int[] arr = new int[s.length()];

    //     for (int i = 0; i < s.length(); i++)
    //         arr[i] = s.charAt(i);
    //     Arrays.sort(arr);
    //     for (int i = arr.length - 1; i >= 0; i--)
    //         answer += (char)arr[i];
    //     System.out.println(answer);
    //     return answer;
    // }
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        for (int i = str.length - 1; i >= 0; i--)
            answer.append(str[i]);
        return answer.toString();
    }
}
