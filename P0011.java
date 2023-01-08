public class P0011 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++)
        {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            while (answer[i].length() != n)
                answer[i] = "0" + answer[i];
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }
}