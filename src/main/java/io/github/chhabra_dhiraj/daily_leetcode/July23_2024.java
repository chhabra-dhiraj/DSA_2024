package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.Arrays;
import java.util.List;

public class July23_2024 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(Arrays.toString(threeSum(nums)));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
    }
}
