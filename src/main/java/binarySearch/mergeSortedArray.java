package binarySearch;

// https://leetcode.com/problems/merge-sorted-array/

public class mergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = m - 1;
        int point2 = n - 1;
        int index = m + n - 1;

        while (point1 >= 0 && point2 >= 0) {
            if (nums1[point1] > nums2[point2]) {
                nums1[index--] = nums1[point1--];
            } else {
                nums1[index--] = nums2[point2--];
            }
        }

        while (point1 >= 0) {
            nums1[index--] = nums1[point1--];
        }

        while (point2 >= 0) {
            nums1[index--] = nums2[point2--];
        }

    }
}
