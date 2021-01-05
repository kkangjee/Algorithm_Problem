public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n/=10;
        }


        System.out.print(answer);

        return answer;
    }
}
//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        int len = (int)Math.log10(n)+1;
//        for(int i = 0; i < len; i++) {
//            answer += n%10;
//            n = n/10;
//        }
//        return answer;
//    }
//}