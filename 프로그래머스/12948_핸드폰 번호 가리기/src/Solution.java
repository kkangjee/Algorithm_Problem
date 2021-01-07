class Solution {
    public String solution(String phone_number) {

        char[] temp = phone_number.toCharArray();
        
        for (int i = phone_number.length()-5; i >= 0; i--) {
            temp[i]='*';
        }

        return new String(temp);
    }
}