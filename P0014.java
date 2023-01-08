import java.util.*;

public class P0014 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++)
        {
            int[] spliceList = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < commands[i][1] - commands[i][0] + 1; j++)
                spliceList[j] = array[commands[i][0] + j - 1];
            Arrays.sort(spliceList);
            answer[i] = spliceList[commands[i][2] - 1];
        }
        return answer;
    }
}
