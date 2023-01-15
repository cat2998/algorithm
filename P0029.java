import java.util.ArrayList;
import java.util.Collections;

public class P0029 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++)
        {
            list.add(score[i]);
            Collections.sort(list, (a, b) -> {return b.compareTo(a);});
            if (i < k)
                answer[i] = list.get(i);
            else
                answer[i] = list.get(k - 1);
        }
        return answer;
    }
}
