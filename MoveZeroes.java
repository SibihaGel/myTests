package org.example;

public class MoveZeroes {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] result = moveZeroes(nums);
        printArray(result);
    }
}
