class Solution {
    public int solution(int num) {
        int cnt = 0;
        long num2 = num;
        while (num2 != 1) {


            if (num2 % 2 == 0) {
                num2 = num2 / 2;
            } else {
                num2 = num2 * 3 + 1;
            }

            cnt++;

        }
        if (cnt>500){
            return -1;
        }
        return cnt;
    }
}

//1-1. 입력된 수가 짝수라면 2로 나눕니다.
//        1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//        2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.