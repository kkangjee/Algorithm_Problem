class Solution {
    public String solution(String s) {
        String answer = "";

        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++) {
            System.out.println(stringBuilder);
            for (int j = 0; j < stringBuilder.length()-i-1; j++) {

                if (stringBuilder.charAt(j)<stringBuilder.charAt(j+1)){
                    char temp = stringBuilder.charAt(j);
                    stringBuilder.setCharAt(j,stringBuilder.charAt(j+1));
                    stringBuilder.setCharAt(j+1,temp);

                }

            }
        }
        answer = stringBuilder.toString();
        return answer;
    }
}