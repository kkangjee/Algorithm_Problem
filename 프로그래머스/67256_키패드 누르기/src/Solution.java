import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};

        Map map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map.put(arr[i][j], i + "" + j);
            }

        }
        System.out.println(map);

        String left = "30";
        String right = "32";
        //{0=31, 1=00, 2=01, 3=02, #=32, 4=10, 5=11, 6=12, 7=20, 8=21, 9=22, *=30}

        for (int i = 0; i < numbers.length; i++) {

            String target = (String) map.get(Integer.toString(numbers[i]));

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left = target;
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                right = target;
            } else {
                int leftDistance = Math.abs(target.charAt(0) - left.charAt(0)) + Math.abs(target.charAt(1) - left.charAt(1));
                int rightDistance = Math.abs(target.charAt(0) - right.charAt(0)) + Math.abs(target.charAt(1) - right.charAt(1));
                if (leftDistance == rightDistance) {
                    if (hand.equals("left")) {
                        answer += "L";
                        left = target;
                    } else {
                        answer += "R";
                        right = target;
                    }
                } else if (leftDistance > rightDistance) {
                    answer += "R";
                    right = target;
                } else {
                    answer += "L";
                    left = target;
                }

            }

        }
        return answer;


    }
}

//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public String solution(int[] numbers, String hand) {
//        //int[] s = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String answer = "";
//
//        String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};
//        Map map = new HashMap();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                map.put(arr[i][j], i + "" + j);
//            }
//
//        }
//        System.out.println(map);
//
//        String left = "30";
//        String right = "32";
//
//        for (int i = 0; i < numbers.length; i++) {
//            //System.out.println(map.get(Integer.toString(numbers[i])));
//
//            String target = (String) map.get(Integer.toString(numbers[i]));
//            int leftDistance = Math.abs(target.charAt(0) - left.charAt(0)) + Math.abs(target.charAt(1) - left.charAt(1));
//            int rightDistance = Math.abs(target.charAt(0) - right.charAt(0)) + Math.abs(target.charAt(1) - right.charAt(1));
//
//            System.out.println(numbers[i]);
//            System.out.println("타겟"+target.charAt(0) + " " + target.charAt(1));
//            System.out.println("왼손" + left.charAt(0) + " " + left.charAt(1));
//            System.out.println("오른손" + right.charAt(0) + " " + right.charAt(1));
//            System.out.println("왼거리" + leftDistance + " 오른거리" + rightDistance);
//
//
//            //{0=31, 1=00, 2=01, 3=02, #=32, 4=10, 5=11, 6=12, 7=20, 8=21, 9=22, *=30}
//            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
//                answer += "L";
//                left = target;
//                System.out.println(target.charAt(1)+" 에 L 추가");
//            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
//                answer += "R";
//                right = target;
//                System.out.println(target.charAt(1)+" 에 R 추가");
//            } else {
//                if (leftDistance == rightDistance) {
//                    if (hand.equals("left")) {
//                        answer += "L";
//                        left = target;
//                    } else {
//                        answer += "R";
//                        right = target;
//                    }
//                } else if (leftDistance > rightDistance) {
//                    answer += "R";
//                    right = target;
//                } else {
//                    answer += "L";
//                    left = target;
//                }
////                System.out.println(answer);
////                System.out.println();
//            }
//
//        }
//        System.out.println(answer);
//        return answer;
//
//
//    }
//}
