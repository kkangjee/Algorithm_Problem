class Solution {
    public int solution(int n) {
        int answer = 0;

        //소수는 1과 자기 자신으로만 나누어진다
        for (int j = 2; j <= n; j++) {
            boolean flag = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {//나누어 지는 경우가 있으므로 소수가 아니다.
                    flag = false;
                    break;
                }
            }
            if (flag) {//소수이다
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
//https://ju-nam2.tistory.com/19 참고

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        //소수는 1과 자기 자신으로만 나누어진다
//        for (int j = 2; j <= n; j++) {
//            boolean flag = true;
//            for (int i = 2; i < j; i++) {
//                if (j % i == 0) {//나누어 지는 경우가 있으므로 소수가 아니다.
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {//소수이다
//                answer++;
//            }
//        }
//
//        System.out.println(answer);
//        return answer;
//    }
//}