public class P0002 {
    boolean solution(String s) {
        boolean answer = true;
        int count_p = 0;
        int count_y = 0;
        String s1 = s.toLowerCase();

        for(char str: s1.toCharArray())     // for each String 돌리기 위해 toCharArray를 이용
        {
            if (str == 'p')
                count_p++;
            else if (str == 'y')
                count_y++;
        }
        if (count_p != count_y)
            answer = false;
        return answer;
    }
}
