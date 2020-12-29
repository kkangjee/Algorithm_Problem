class Solution {
    public String solution(String s) {
        String answer = "";

        int s_length = s.length();
        if (s_length%2==0){
            answer+=s.charAt(s_length/2-1);
        }
        answer+=s.charAt(s_length/2);

        return answer;
    }
}