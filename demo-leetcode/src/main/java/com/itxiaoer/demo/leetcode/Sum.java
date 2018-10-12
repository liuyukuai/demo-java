package com.itxiaoer.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : liuyk
 */
public class Sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{3, 2, 4};
        System.out.println(Arrays.toString(twoSum(ints, 6)));
        List list = new ArrayList();
    }
}
