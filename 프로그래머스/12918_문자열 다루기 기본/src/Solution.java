class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (!(s.length()==4||s.length()==6))
            return false;

        for (int c = 0; c < s.length(); c++) {
            if (!Character.isDigit(s.charAt(c))) {
                answer = false;
                break;
            }
            //System.out.println(s.charAt(c));
        }

        return answer;
    }
}