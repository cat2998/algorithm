public class P0023 {
    public int solution(String dartResult) {
        int i;
        int answer = 0;
        int[] score = new int[3];

        i = 0;
        for (char c : dartResult.toCharArray())
        {
            if (c == '*')
            {
                score[i - 1] = score[i - 1] * 2;
                if ((i - 1) != 0)
                    score[i - 2] = score[i - 2] * 2;
            }
            else if (c == '#')
                score[i - 1] = score[i - 1] * (-1);
            else if (score[i] != 0 && c == '0')
                score[i] = score[i] * 10;
            else if ('0' <= c && c <= '9')
                score[i] = c - '0';
            else if (c == 'S')
                score[i] = (int)Math.pow(score[i++], 1);
            else if (c == 'D')
                score[i] = (int)Math.pow(score[i++], 2);
            else if (c == 'T')
                score[i] = (int)Math.pow(score[i++], 3);
        }
        for (i = 0; i < 3; i++)
            answer += score[i];
        return answer;
    }
}
