class Solution {
    public long solution(long n) {
        double temp = Math.sqrt(n);

        if (temp-(int)temp==0.0)
            return (long) Math.pow(temp+1,2);
        return -1;
    }
}