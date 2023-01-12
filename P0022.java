public class P0022 {
    public int solution(String t, String p) {
        int answer = 0;
        int sizeP = p.length();
        Long longP = Long.parseLong(p);

        for (int i = 0; i + sizeP <= t.length(); i++)
        {
            String str = t.substring(i, i + sizeP);
            if (Long.parseLong(str) <= longP)
                answer++;
        }
        return answer;
    }
}
