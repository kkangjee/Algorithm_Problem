public class Main {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] array = {};
//        int[][] commands = {};

        Solution solution = new Solution();
        solution.solution(array,commands);

        //System.out.println(board);
        //System.out.println(moves);
    }
}
