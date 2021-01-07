class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while (x != 0) {
            sum += x % 10;
            x /= 10;

        }
        if (temp % sum == 0)
            return true;
        else
            return false;
    }
}