package com.isaac.leetcodes101_200;

/**
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 *
 * Tags: Hash Table, Bit Manipulation.
 *
 * @author ZHANG HAO
 *
 *         Explain: 一个数亦或上自身等于0
 *
 */
public class LeetCode_136_Single_Number {

	public static void main(String[] args) {

	}

	public static int singleNumber(int[] nums) {
		int res = 0;
		for (int i : nums) {
			res ^= i;
		}
		return res;
	}

}
