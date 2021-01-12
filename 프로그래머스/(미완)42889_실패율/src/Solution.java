import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];


        double[] fail = new double[N];
        Arrays.sort(stages);
        //System.out.println(Arrays.toString(stages));

        int temp = 1;
        for (int i = 0; i < stages.length; i++) {
            if (temp >= N) {
                break;
            }
            if (stages[i] == temp) {
                fail[temp - 1]++;
            } else {
                i--;
                temp++;
            }
        }
        //System.out.println(Arrays.toString(fail));

        Map map = new HashMap<Integer,Double>();
        for (int i = 0, j = stages.length; i < fail.length; i++) {
            //System.out.println(fail[i] + " / " + j + " = " + fail[i] / j);

            int a = (int) fail[i];
            fail[i] /= j;
            map.put(i + 1, fail[i]);
            j -= a;

        }

        //System.out.println(Arrays.toString(fail));
        System.out.println(map);
        //System.out.println(map.get(2));
        double max = 0;
        int big = 0;

        for (int i = 1; i <= map.size(); i++) {
            if ((double) map.get(i) > max) {
                max = (double) map.get(i);
                big = i;
            }
            System.out.println(i);
        }

        for (int j = 0; j < answer.length; j++) {
            for (int i = 1; i <= map.size(); i++) {
                if ((double) map.get(i) > max) {
                    max = (double) map.get(i);
                    big = i;
                }
            }
            answer[j]= big;
            map.remove(big);
            max = 0;
        }

        System.out.println(answer);
//        Object[] mapkey = map.values().toArray();
//        Arrays.sort(mapkey, Collections.reverseOrder());
//
//        System.out.println(Arrays.toString(mapkey));
//        double max = 0.0;
//
//        for (int i = 0; i < fail.length; i++) {
//            if (max<fail[i]){
//                max = fail[i];
//            }
//        }


        return answer;
    }
}