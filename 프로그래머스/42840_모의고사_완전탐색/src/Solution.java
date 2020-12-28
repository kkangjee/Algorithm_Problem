import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {


        int[] su1 = {1, 2, 3, 4, 5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int su1_num = 0;
        int su2_num = 0;
        int su3_num = 0;

        int su1_count = 0;
        int su2_count = 0;
        int su3_count = 0;

        for (int i = 0; i < answers.length; i++, su1_count++, su2_count++, su3_count++) {
            //System.out.println(su1_num+ " "+su2_num+ " "+su3_num);
            //System.out.println(answers[i] + " " + su1[su1_count]);
            if (su1_count == su1.length) {
                su1_count = 0;
            }
            if (su2_count == su2.length) {
                su2_count = 0;
            }
            if (su3_count == su3.length) {
                su3_count = 0;
            }
            if (answers[i] == su1[su1_count]) {
                su1_num++;
            }
            if (answers[i] == su2[su2_count]) {
                su2_num++;
            }
            if (answers[i] == su3[su3_count]) {
                su3_num++;
            }

        }


        int top = Math.max(su1_num,Math.max(su2_num,su3_num));

        ArrayList arrayList = new ArrayList();
        if (top == su1_num) {
            arrayList.add(1);
        }
        if (top == su2_num) {
            arrayList.add(2);
        }
        if (top == su3_num) {
            arrayList.add(3);
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = (int) arrayList.get(i);

        }


        return answer;
    }
}