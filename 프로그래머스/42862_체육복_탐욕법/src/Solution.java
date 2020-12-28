import java.util.HashMap;
        import java.util.Map;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hashMap.put(i, 1);

            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == i) {
                    hashMap.put(i, 2);
                }
            }

            for (int j = 0; j < lost.length; j++) {
                if (lost[j] == i) {
                    hashMap.put(i, hashMap.get(i) - 1);
                }
            }
        }
        //System.out.println(hashMap + " 초기 ");

        for (int i = 1; i < n; i++) {
            //System.out.println(hashMap);
            if (hashMap.get(i) == 0 && hashMap.get(i + 1) == 2) {
                hashMap.put(i, 1);
                hashMap.put(i + 1, 1);
            } else if (hashMap.get(i) == 2 && hashMap.get(i + 1) == 0) {
                hashMap.put(i, 1);
                hashMap.put(i + 1, 1);
            }

//            if (hashMap.get(i - 1) == 2 && hashMap.get(i) == 0) {
//                hashMap.put(i,1);
//                hashMap.put(i - 1,1);
//            }
//            if (hashMap.get(i) == 2 && hashMap.get(i + 1) == 0) {
//                hashMap.put(i+1,1);
//                hashMap.put(i,1);
//
//            }
        }
        for (int i = 1; i <= hashMap.size(); i++) {
            if (hashMap.get(i) == 1 || hashMap.get(i) == 2) {
                answer++;
            }
        }
        //System.out.println(answer);

        return answer;
    }
}