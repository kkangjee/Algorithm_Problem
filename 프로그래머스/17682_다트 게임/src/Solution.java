class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        dartResult += ' ';
        int before = 0;

        for (int i = 0; i < dartResult.length() - 1; ) {
            char c = dartResult.charAt(i);
            char d = dartResult.charAt(i + 1);
            char e = dartResult.charAt(i + 2);

            System.out.print(i + " " + c + " " + d + " " + e +" "+before+" ");

            if (c == '1' && d == '0') {
                c = 't';
                i++;
                d = dartResult.charAt(i + 1);
                e = dartResult.charAt(i + 2);
            }

            if (Character.isDigit(e) || e == ' ') {//상이 없음
                before = getPow(c, d);
                answer += before;
                i += 2;
            } else {//상 있음
                switch (e) {
                    case '*': {
                        answer += before;
                        before = getPow(c, d) * 2;
                        answer += before;
                        break;
                    }
                    case '#': {
                        before = getPow(c, d) * -1;
                        answer += before;
                        break;
                    }
                }
                i += 3;
            }
            System.out.println(answer);
        }

        return answer;
    }

    int getPow(char c, char d) {
        int temp = Character.getNumericValue(c);
        if (c == 't') {
            temp = 10;
        }
        switch (d) {
            case 'S': {
                return (int) Math.pow(temp, 1);
            }
            case 'D': {
                return (int) Math.pow(temp, 2);
            }
            case 'T': {
                return (int) Math.pow(temp, 3);
            }
        }
        return temp;
    }
}
