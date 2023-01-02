public class P0001 {
    public int[] solution(long n) {
        String str = String.valueOf(n);     // 정수를 String 으로 형변환
        int[] answer = new int[str.length()];   // C 와 달리 Java 에서는 미지수를 배열의 크기에 사용할 수 있다.
                                                // 이유 찾아줘..! 내일의 지현아
        
        for (int i = 0; i < str.length(); i++)
        {
            answer[i] = str.charAt(str.length() - i - 1) - '0';     // charAt은 String을 Index로 접근
        }
        return answer;
    }
}
