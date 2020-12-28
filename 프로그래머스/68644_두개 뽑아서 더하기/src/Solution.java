import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Solution {
    public void printArr(ArrayList numbers){
        for (Object i:numbers){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void printArr(int[] numbers){
        for (Object i:numbers){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public int[] solution(int[] numbers) {
        //int[] answer = {};
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i]+numbers[j];
                //System.out.println(numbers[i]+" + "+numbers[j] +" = "+ sum);
                if (!arrayList.contains(sum))
                    arrayList.add(sum);
            }
        }
        Collections.sort(arrayList);

        int size = 0;
        int[] answer = new int[arrayList.size()];
        for(Object temp : arrayList){
            answer[size++] = (int) temp;
        }
        printArr(answer);

        return answer;
    }
}