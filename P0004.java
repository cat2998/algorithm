public class P0004 {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int copy_x = x;
        
        while (x != 0)
        {
            sum += x % 10;
            x /= 10;
        }
        if ((copy_x % sum) == 0)
            answer = true;
        return answer;
    }
}
