public class P0025 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min_count = 0;
        int max_count = 0;

        for (int i = 0; i < 6; i++)
        {
            if (lottos[i] == 0)
            {
                max_count++;
                continue;
            }
            for (int j = 0; j < 6; j++)
            {
                if (lottos[i] == win_nums[j])
                {
                    min_count++;
                    break;
                }
            }
        }
        max_count = min_count + max_count;
        answer[0] = rank(max_count);
        answer[1] = rank(min_count);
        return answer;
    }

    public int rank(int count)
    {
        if (count == 6)
            return 1;
        if (count == 5)
            return 2;
        if (count == 4)
            return 3;
        if (count == 3)
            return 4;
        if (count == 2)
            return 5;
        return 6;
    }
}
