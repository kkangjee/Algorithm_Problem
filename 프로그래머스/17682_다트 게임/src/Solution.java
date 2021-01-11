import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] arr = {"", "", ""};


        //dartResult += ' ';

        for (int i = 0, j = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                arr[j] += c;
            } else {
                answer += getPow(c, arr[j]);
                j++;
            }
            System.out.println(arr[j]);
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0, j = 0; i < dartResult.length() - 1; i++) {
//            char c = dartResult.charAt(i);
//            char d = dartResult.charAt(i+1);
//            if (Character.isDigit(d)) {
//                arr[j] += c;
//            } else {
//                if ()
//                arr[j] += c;
//
//            }
//        }

        //System.out.print(answer);

        return answer;
    }

    int getPow(char c, String temp) {
        switch (c) {
            case 'S': {
                return (int) Math.pow(Integer.parseInt(temp), 1);
            }
            case 'M': {
                return (int) Math.pow(Integer.parseInt(temp), 2);
            }
            case 'T': {
                return (int) Math.pow(Integer.parseInt(temp), 3);
            }
//            case '*': {
//                result *= 2;
//                break;
//            }
//            case '#': {
//                result *= -1;
//                break;
//            }
        }
        return 0;
    }

}
//class Solution {
//    public int solution(String dartResult) {
//        int answer = 0;
//        dartResult += ' ';
//
//        int temp = 0;
//        for (int i = 0; i < dartResult.length() - 2; ) {
//
//            char c = dartResult.charAt(i);
//            char d = dartResult.charAt(i + 1);
//
//            if (d == '0') {
//                i++;
//                c = 't';
//                d = dartResult.charAt(i + 1);
//            }
//            if (dartResult.charAt(i + 2) != ' ' && dartResult.charAt(i + 2) == '#') {// 숫자 문자 #
//                temp = getMid(c, d) * (-1);
//                answer += temp;
//                i += 3;
//            } else if (dartResult.charAt(i + 2) != ' ' && dartResult.charAt(i + 2) == '*') {//숫자 문자 *
//                if (c == '2' || c == '3') {
//                    answer += temp;
//                }
//                temp = getMid(c, d) * 2;
//                answer += temp;
//                i += 3;
//            } else {//숫자 문자
//                temp = getMid(c, d);
//                answer += temp;
//                i += 2;
//            }
//        }
//        return answer;
//    }
//
//    private int getMid(char c, char d) {
//        int mid = 0;
//        int temp = 0;
//
//        if (c == 't') {
//            temp = 10;
//        } else {
//            temp = Character.getNumericValue(c);
//        }
//
//        if (d == 'S') {
//            mid = temp;
//        } else if (d == 'D') {
//            mid = (int) Math.pow(temp, 2);
//        } else if (d == 'T') {
//            mid = (int) Math.pow(temp, 3);
//        }
//        return mid;
//    }
//}


////프린트 있음
//class Solution {
//    public int solution(String dartResult) {
//        int answer = 0;
//
//        System.out.println(dartResult);
//        dartResult += ' ';
//
//        int temp = 0;
//        for (int i = 0; i < dartResult.length() - 2; ) {
//
//            System.out.print(i + " ");
//            char c = dartResult.charAt(i);
//            char d = dartResult.charAt(i + 1);
//
//            if (c == '1' && d == '0') {
//                i++;
//                c = 't';
//                d = dartResult.charAt(i + 1);
//            }
//            if (dartResult.charAt(i + 2) != ' ' && dartResult.charAt(i + 2) == '#') {// 숫자 문자 #
//                temp = getMid(c, d) * (-1);
//                answer += temp;
//                i += 3;
//                System.out.print("# ");
//            } else if (dartResult.charAt(i + 2) != ' ' && dartResult.charAt(i + 2) == '*') {//숫자 문자 *
//                if (c == '2' || c == '3') {
//                    answer += temp;
//                }
//                temp = getMid(c, d) * 2;
//                answer += temp;
//                i += 3;
//                System.out.print("* ");
//            } else {//숫자 문자
//                temp = getMid(c, d);
//                answer += temp;
//                i += 2;
//                System.out.print("@ ");
//            }
//            System.out.println(c + " " + d + " " + answer + " " + getMid(c, d));
//        }
//
//
//        return answer;
//    }
//
//    private int getMid(char c, char d) {
//        int mid = 0;
//        int temp = 0;
//        if (c == 't') {
//            temp = 10;
//        } else {
//            temp = Character.getNumericValue(c);
//        }
//
//        //System.out.print(d);
//        if (d == 'S') {
//            mid = temp;
//        } else if (d == 'D') {
//            mid = (int) Math.pow(temp, 2);
//        } else if (d == 'T') {
//            mid = (int) Math.pow(temp, 3);
//        }
//        return mid;
//    }
//}
