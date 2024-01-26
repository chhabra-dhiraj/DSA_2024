package io.github.chhabra_dhiraj;

public class BsInterviewQuestions {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 21};
        System.out.println(getCeilingNumber(arr, 20));
        System.out.println("=================================");
        System.out.println("=================================");
        char[] charArr = {'a', 'b', 'd', 'j'};
        System.out.println(getSmallestLetter(charArr, 'c'));
    }

    // Ceiling of a target number
    private static int getCeilingNumber(int[] arr, int target) {
        if (arr == null || arr.length == 0 || target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = arr[mid];

            if(midElement == target) {
                return mid;
            } else if (target > midElement) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    // Smallest letter greater than target
    private static char getSmallestLetter(char[] letters, char target) {
        if (letters == null || letters.length == 0) {
            return '\u0000';
        }

        if(target >= letters[letters.length - 1]) {
            return letters[0];
        }

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = letters[mid];

            if(target >= midElement) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start];
    }
}
