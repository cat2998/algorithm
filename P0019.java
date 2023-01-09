import java.util.HashMap;

public class P0019 {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (map.get(nums[i]) == null)
                map.put(nums[i], 1);
        }
        if (map.size() > nums.length / 2)
            answer = nums.length / 2;
        else
            answer = map.size();
        return answer;
    }
}
