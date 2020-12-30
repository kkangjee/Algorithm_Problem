class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int y_cnt = 0;
        int p_cnt = 0;

        for (int i = 0; i<s.length();i++){
            if (s.charAt(i)=='y'||s.charAt(i)=='Y')
                y_cnt++;
            else if (s.charAt(i)=='p'||s.charAt(i)=='P')
                p_cnt++;

        }

        if (y_cnt!=p_cnt)
            answer = false;

        return answer;
    }
}