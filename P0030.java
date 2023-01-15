import java.util.ArrayList;
import java.util.Collections;

public class P0030 {
    public String solution(String X, String Y) {
        StringBuffer answer = new StringBuffer();
        ArrayList<Character> list = new ArrayList<Character>();
        int[] check = new int[10];

        for (char x: X.toCharArray())
            check[x - '0']++;
        for (char y: Y.toCharArray())
        {
            if (check[y - '0'] != 0)
            {
                list.add(y);
                check[y - '0']--;
            }
        }
        if (list.size() == 0)
            return "-1";
        Collections.sort(list, (a, b) -> {return b.compareTo(a);});
        if (list.get(0).equals('0'))
            return "0";
        for (char c: list)
            answer.append(c);
        return answer.toString();
    }
}
