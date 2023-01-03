import java.util.Arrays;

public class P0005 {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        int[] array = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
            array[i] = str.charAt(i) - '0';
        Arrays.sort(array);
        for (int i = str.length() - 1; i >= 0; i--)
        {
            answer = answer * 10 + array[i];
            System.out.println(answer);
        }
        return answer;
    }
}
