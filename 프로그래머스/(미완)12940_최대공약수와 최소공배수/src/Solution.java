class Solution {

    int GCF(int n, int m){
        if (n>m){
            if (n%m==0)
                return m;
        }
        else {
            if (m%n==0)
                return n;
        }
        return 1;
    }
    int LCM(int n, int m){
        if (n>m){
            if (n%m==0)
                return n;
        }
        else {
            if (m%n==0)
                return m;
        }
        return n*m;
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = GCF(n,m);
        answer[1] = LCM(n,m);

        return answer;
    }
}