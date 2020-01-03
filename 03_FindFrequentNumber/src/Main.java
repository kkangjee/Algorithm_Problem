public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};


        int[] temp = new int[10];
        int top = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            temp[arr[i]]++;

        }
        for (int i = 0; i < temp.length - 1; i++) {
            //System.out.println(temp[i]);
            if (temp[i] > top) {
                top = temp[i];
            }
        }
        System.out.println(top);
    }
}
