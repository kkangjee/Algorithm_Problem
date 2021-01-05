class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                answer += ' ';
            else if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a') {
                if (s.charAt(i) + n > 'z')
                    answer += (char) (s.charAt(i) - 26+n);
                else
                    answer += (char) (n + s.charAt(i));
            } else if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                if (s.charAt(i) + n > 'Z')
                    answer += (char) (s.charAt(i) - 26+n);
                else
                    answer += (char) (n + s.charAt(i));
            }
        }
        System.out.println(answer);
        return answer;
    }
}