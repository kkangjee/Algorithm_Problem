import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList answer = new ArrayList();

        while (n != 0) {
            answer.add(n % 10);
            n /= 10;
        }
        return answer;
    }
}