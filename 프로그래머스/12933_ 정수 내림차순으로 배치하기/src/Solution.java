import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;

        ArrayList arrayList = new ArrayList();

        while (n != 0) {
            arrayList.add(n % 10);
            n /= 10;
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        long ten = 1;
        for (int i = arrayList.size()-1; i >= 0; i--, ten *= 10) {
            answer += (long) arrayList.get(i) * ten;
        }
        return answer;
    }
}
//Arrays.sort(arr, Collections.reverseOrder());