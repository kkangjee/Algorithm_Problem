class Solution {
    String makeBinaryNumber(int input, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            if (input % 2 == 0) {
                result += " ";
            } else {
                result += "#";
            }
            input /= 2;
        }


        return new StringBuffer(result).reverse().toString();
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = String.valueOf(makeBinaryNumber(arr1[i] | arr2[i], n));
            System.out.println(answer[i]);
        }

        return answer;
    }
}

//class Solution {
//    String makeBinaryNumber(int input) {
//        String result = "";
//        while (input != 0) {
//            if (input % 2 == 0) {
//                result += "0";
//            } else {
//                result += "1";
//            }
//            input /= 2;
//        }
//
//
//        return new StringBuffer(result).reverse().toString();
//    }
//
//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
//
//        //System.out.print(makeBinaryNumber(20));
//
//
//        for (int i = 0; i < n; i++) {
//            makeBinaryNumber(arr1[i]);
//        }
//
//        return answer;
//    }
//}