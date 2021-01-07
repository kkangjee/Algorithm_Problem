class Solution {

    int GCF(int n, int m) {
        if (n > m) {
            while (m!= 0){
                int remain = n%m;
                n = m;
                m = remain;
            }
            return n;
        } else {
            while (n!= 0){
                int remain = m%n;
                m = n;
                n = remain;
            }
            return m;
        }
    }

    int LCM(int n, int m) {
        return n * m/GCF(n,m);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = GCF(n, m);
        answer[1] = LCM(n, m);

        return answer;
    }
}
//class Solution {
//
//    int GCF(int n, int m) {
//        int remain, result = 0;
//
//        if (n==m){
//            return 1;
//        }
//        else if (n > m) {
//            remain = m;
//            while (remain != 0) {
//                result = remain;
//                remain = n % remain;
//                if (remain == 0) {
//                    return result;
//                }
//            }
//
//        } else {
//            remain = n;
//            while (remain != 0) {
//                result = remain;
//                remain = m % remain;
//                if (remain == 0) {
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
//
//    int LCM(int n, int m) {
//        return n * m/GCF(n,m);
//    }
//
//    public int[] solution(int n, int m) {
//        int[] answer = new int[2];
//
//        answer[0] = GCF(n, m);
//        answer[1] = LCM(n, m);
//
//        return answer;
//    }
//}