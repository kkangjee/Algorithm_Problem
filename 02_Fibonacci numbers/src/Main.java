public class Main {

    static void fibonacci() {
        int[] arr = new int[10];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length - 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void main(String[] args) {

        fibonacci();
    }
}
