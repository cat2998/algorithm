public class P0003 {
    public int solution(String s) {
        int answer = 0;
        int minus = 1;
        for(int i = 0; i < s.length(); i++)
        {
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            {
                if (s.charAt(i) == '-')
                    minus = -1;
            }
            else
                answer = answer * 10 + s.charAt(i) - '0';
        }
        answer *= minus;
        return answer;
    }
}
