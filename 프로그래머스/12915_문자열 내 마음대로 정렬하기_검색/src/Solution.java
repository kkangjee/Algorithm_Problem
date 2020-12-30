import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(answer);

        for (int i = 0; i < strings.length; i++) {
            answer[i] = answer[i].substring(1);
        }

        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}

//import java.util.Arrays;
//
//class Solution {
//    public String[] solution(String[] strings, int n) {
//        String[] answer = {};
//
//
//
//        char c = strings[0].charAt(n);
//
//        boolean isSame = true;
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].charAt(n) != c) {
//                isSame = false;
//                break;
//            }
//        }
//
//        if (!isSame){
//            Arrays.sort(strings);
//            System.out.println("test");
//
//        }else {
//            for (int i = 0; i < strings.length; i++) {
//                for (int j = i; j < strings.length-1; j++) {
//                    if (strings[j].charAt(n)>strings[j+1].charAt(n)){
//                        String temp = strings[j];
//                        strings[j] = strings[j+1];
//                        strings[j+1] = temp;
//                    }
//                }
//            }
//        }
//
//        System.out.print(Arrays.toString(strings));
//        answer = strings;
//        return answer;
//    }
//}