import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {

    public int[] solution(int[] array, int[][] commands) {


        int[] answer = new int[commands.length];



        int i, j, k;
        for (int m = 0; m < commands.length; m++) {
            i = commands[m][0] - 1;
            j = commands[m][1] - 1;
            k = commands[m][2] - 1;

            int[] temp = Arrays.copyOfRange(array,i,j+1);

            Arrays.sort(temp);

            answer[m] = temp[k];

            //System.out.println(Arrays.toString(temp));


        }


        //System.out.println(Arrays.toString(answer));


        return answer;
    }
}

//import java.util.ArrayList;
//import java.util.Collections;
//
//class Solution {
//
//    public int[] solution(int[] array, int[][] commands) {
//
//
//        int[] answer = new int[commands.length];
//
//        int i, j, k;
//        for (int m = 0; m < commands.length; m++) {
//            i = commands[m][0] - 1;
//            j = commands[m][1] - 1;
//            k = commands[m][2] - 1;
//
//            System.out.println(i+" "+j+" "+k);
//            ArrayList arrayList = new ArrayList();
//
//            if (i == j) {
//                arrayList.add(array[i]);
//            } else {
//                for (int n = 0; n < j - i + 1; n++) {
//                    arrayList.add(array[n]);
//                }
//
//            }
//
//            Collections.sort(arrayList);
//            System.out.println(arrayList);
//            System.out.println(arrayList.get(k));
//            answer[m]= (int) arrayList.get(k);
//        }
//
//
//        //System.out.println(Arrays.toString(commands[0]));
//
//
//        return answer;
//    }
//}