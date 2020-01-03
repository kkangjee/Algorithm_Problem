//10진수를 2진수로 표현
//배열, 반복문 사용
public class Main {
    static void decimalToBinary(int decimal) {
        int[] binary = new int[10];
        int i = 0;
        while (decimal != 0) {
            binary[i++] = decimal % 2;
            decimal /= 2;
        }
        for (i--; i >= 0; i--) {
            System.out.print(binary[i] + " ");
        }
    }

    public static void main(String[] args) {
        int decimal = 19;
        decimalToBinary(decimal);
    }
}
//while(decimal!=0||decimal!=1){
//
//        System.out.println(decimal);
//        decimal=decimal/2;
//
//        }
