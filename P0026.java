import java.util.Arrays;

public class P0026 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        answer += findLost(lost, reserve);
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < reserve.length; i++)
        {
            for (int j = 0; j < lost.length; j++)
            {
                if (reserve[i] != -1 && (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]))
                {
                    reserve[i] = -1;
                    lost[j] = -1;
                    answer++;
                }
            }
        }
        
        return answer;
    }

    public int findLost(int[] lost, int[] reserve)
    {
        int count = 0;
        for (int i = 0; i < lost.length; i++)
        {
            for (int j = 0; j < reserve.length; j++)
            {
                if (lost[i] != -1 && lost[i] == reserve[j])
                {
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                }
            }
        }
        return count;
    }
}
