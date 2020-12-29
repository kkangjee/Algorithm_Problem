import java.util.*;

public class Solution {
    public ArrayList solution(int []arr) {
        int[] answer = {};

        ArrayList arrayList = new ArrayList<Integer>();
        arrayList.add(arr[0]);
        for (int i = 1;i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
                if (arr[j-1]==arr[j]){
                    i++;
                }
                else {
                    arrayList.add(arr[j]);
                    break;
                }
            }
            //System.out.println(arrayList);

        }

        return arrayList;
    }
}