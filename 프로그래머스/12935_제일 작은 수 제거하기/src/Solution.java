import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList();

        int small = Integer.MAX_VALUE;
        int min_idx = 0;
        for (int i =0;i<arr.length;i++) {
            answer.add(arr[i]);
            if (small > arr[i]) {
                small = arr[i];
                min_idx = i;
            }

        }
        answer.remove(min_idx);
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}