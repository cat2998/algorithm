public class P0008 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder str = new StringBuilder();

        while (n != 0)
        {
            str.append(n % 3);
            n /= 3;
        }
        answer = Integer.parseInt(str.toString(), 3);
        // String s = Integer.toString(Integer.parseInt(str.toString()));
        // for (int i = 0; i < s.length(); i++)
        // {
        //     answer += (s.charAt(s.length() - i - 1) - '0') * (int)Math.pow(3, i);
        // }
        return answer;
    }
}
