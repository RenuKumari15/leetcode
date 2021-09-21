package letcode;

import java.util.Scanner;

class FindConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                count = count + 1;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array:");
        int length = scanner.nextInt();
        int[] input = new int[length];
        System.out.println("Please enter the array elements");
        for (int i = 0; i < length; i++) {
            input[i] = scanner.nextInt();
        }

        FindConsecutiveOnes findConsecutiveOnes = new FindConsecutiveOnes();
        int result = findConsecutiveOnes.findMaxConsecutiveOnes(input);
        System.out.println("Output is: " + result);
    }
}
