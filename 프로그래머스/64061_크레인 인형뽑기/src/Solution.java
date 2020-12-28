import java.util.Arrays;
import java.util.Stack;

class Solution {
//    public void printArr(int[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            System.out.println(Arrays.toString(board[i]));
//        }
//    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        int row_size = board.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            //printArr(board);
            for (int row = 0; row < row_size; row++) {
                if (board[row][moves[i] - 1] != 0) {
                    if (!stack.empty() && stack.peek() == board[row][moves[i] - 1]) {
                        stack.pop();
                        answer++;
                    } else {
                        stack.push(board[row][moves[i] - 1]);
                    }
                    System.out.println(stack);
                    board[row][moves[i] - 1] = 0;
                    break;
                }
            }

        }
        return answer*2;
    }
}

//import java.util.Arrays;
//import java.util.Stack;
//
//class Solution {
//    public void printArr(int[][] board){
//        for (int i = 0; i < board.length; i++) {
//            System.out.println(Arrays.toString(board[i]));
//        }
//    }
//    public int solution(int[][] board, int[] moves) {
//        int answer = 0;
//
//        int row_size = board.length;
//        int col_size = board[0].length;
//
//        Stack<Integer> stack = new Stack<>();
//
//        boolean flag = false;
//
//        //printArr(board);
//
//        for (int i = 0; i < moves.length; i++) {
//            printArr(board);
//            //System.out.println(Arrays.deepToString(board));
//            for (int col = 0; col < col_size; col++) {
//                if (flag){
//                    flag=false;
//                    break;
//                }
//                for (int row = 0; row < row_size; row++) {
//                    System.out.println(board[row][col]+" "+ moves[i]);
//                    if (board[row][col] != 0) {
////                        if (board[row][col] == moves[i]){
////                            board[row][col] = 0;
////                            flag=true;
////                        }
//                        if (board[row][moves[i-1]]==)
//                        board[row][col] = 0;
//                        flag=true;
//                        break;
//                    }
//                }
//            }
//
//        }
//
//        //printArr(board);
//        // System.out.println(board);
//        // System.out.println(moves);
//        return answer;
//    }
//}