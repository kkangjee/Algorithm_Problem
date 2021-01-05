class Solution {
    public String solution(String s) {
        String answer = "";

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += (char) s.charAt(i);
                cnt = 0;
            } else if (cnt % 2 == 0) {
                if (Character.isLowerCase(s.charAt(i))) {
                    answer += (char) (s.charAt(i) - 32);
                } else
                    answer += (char) s.charAt(i);
                cnt++;
            } else {
                if (Character.isUpperCase(s.charAt(i))) {
                    answer += (char) (s.charAt(i) + 32);
                } else
                    answer += (char) s.charAt(i);
                cnt++;
            }

//            if (s.charAt(i) == ' ') {
//                answer += (char) s.charAt(i);
//
//            } else if (cnt % 2 == 0) {
//                if (Character.isLowerCase(s.charAt(i))) {
//                    answer += (char) (s.charAt(i) - 32);
//                } else
//                    answer += (char) s.charAt(i);
//
//            } else {
//                if (Character.isUpperCase(s.charAt(i))) {
//                    answer += (char) (s.charAt(i) + 32);
//                } else
//                    answer += (char) s.charAt(i);
//            }

            System.out.println(answer);
        }

        return answer;
    }
}