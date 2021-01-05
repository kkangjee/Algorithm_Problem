import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList arrayList = new ArrayList();

        for (int i = 1; i <= (n + 1) / 2; i++) {
            if (n % i == 0) {
                if (!arrayList.contains(i))
                    arrayList.add(i);
                if (!arrayList.contains(n / i))
                    arrayList.add(n / i);
            }
        }

        for (Object i : arrayList) {
            answer += (int) i;
        }
        return answer;
    }
}