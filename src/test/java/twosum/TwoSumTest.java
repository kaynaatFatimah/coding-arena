package twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testLeetCodeTest1() {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testLeetCodeTest2() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testLeetCodeTest3() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testNegativeNumbers() {
        TwoSum solution = new TwoSum();
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testLargeArray() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[10000];
        for (int i = 0; i < 9999; i++) nums[i] = i; // Fill with 0, 1, 2, ..., 9998
        nums[9999] = 10000;
        int target = 10001;
        int[] expected = {1, 9999};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
