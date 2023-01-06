public class P0010 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;

        make(sizes);
        for (int i = 0; i < sizes.length; i++)
        {
            if (sizes[w][0] < sizes[i][0])
                w = i;
            if (sizes[h][1] < sizes[i][1])
                h = i;
        }
        answer = sizes[w][0] * sizes[h][1];
        return answer;
    }

    void make(int[][] sizes)
    {
        int temp;

        for(int i = 0; i < sizes.length; i++)
        {
            if (sizes[i][0] > sizes[i][1])
            {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        return ;
    }
}
