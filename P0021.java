import java.util.*;
import java.util.Map.Entry;

public class P0021 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int length = stages.length;;
        HashMap<Integer, Integer> stageClear = new HashMap<>();
        HashMap<Integer, Double> stageFailRate = new HashMap<>();

        for (int temp: stages)
            stageClear.put(temp, stageClear.getOrDefault(temp, 0) + 1);
        for (int i = 1; i <= N; i++)
        {
            stageFailRate.put(i, stageClear.getOrDefault(i, 0) / (double)length);
            length -= stageClear.getOrDefault(i, 0);
        }
        List<Entry<Integer, Double>> entry = new ArrayList<Entry<Integer, Double>>(stageFailRate.entrySet());
        Collections.sort(entry, new Comparator<Entry<Integer, Double>>() {
            @Override
            public int compare(Entry<Integer, Double> e1, Entry<Integer, Double> e2) {
                if (e1.getValue() - e2.getValue() > 0)
                    return -1;
                else if (e1.getValue() - e2.getValue() < 0)
                    return 1;
                else
                    return e1.getKey().compareTo(e2.getKey());
            }
        });
        for (int i = 0; i < N; i++)
            answer[i] = entry.get(i).getKey();
        return answer;
    }
}
