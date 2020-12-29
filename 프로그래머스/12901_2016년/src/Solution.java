class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //16.1.1은 금요일

        int total_day = 0;
        for (int i = 0; i < a - 1; i++) {
            total_day += month[i];
        }

        total_day += b - 1;

        int answer_num = (total_day + 5) % 7;

        answer = day[answer_num];


        System.out.print(answer);
        return answer;
    }
}