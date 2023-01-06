public class P0009 {
    public String solution(String s, int n) {
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < s.length(); i++)
        {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                answer.append((char)('a' + (s.charAt(i) - 'a' + n) % 26));
            else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
                answer.append((char)('A' + (s.charAt(i) - 'A' + n) % 26));
            else
                answer.append(s.charAt(i));
        }
        return answer.toString();
    }
}
