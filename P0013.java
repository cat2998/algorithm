import java.util.*;

public class P0013 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2)
            {
                if (s1.charAt(n) - s2.charAt(n) > 0)
                    return 1;
                else if (s1.charAt(n) - s2.charAt(n) < 0)
                    return -1;
                else
                    return s1.compareTo(s2);
            }
        });
        return strings;
    }
}
