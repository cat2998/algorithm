public class P0017 {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        answer.append(0);
        for (int i = food.length - 1; i > 0; i--)
        {
            if ((food[i] % 2) == 1)
                food[i] -= 1;
            while (food[i] != 0)
            {
                answer.insert(0, i);
                answer.append(i);
                food[i] -= 2;
            }
        }
        return answer.toString();
    }
}
